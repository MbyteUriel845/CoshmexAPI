package com.coshmex.store.service;

import com.coshmex.store.mappper.ProductMapper;
import com.coshmex.store.model.Item;
import com.coshmex.store.model.Producto;
import com.coshmex.store.repository.ProductRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService{
    static private Logger logger = LogManager.getLogger(ProductoServiceImpl.class);

    @Autowired
    ProductRepository productRepository;
    @Autowired
    ProductMapper mapper = new ProductMapper();
    @Value("${app.command.python}")
    private String pythonCommand;

    @Override
    public Item existeProducto(Item producto) {
        Item itemTemporal = new Item();
        productRepository.findByClave(producto.getClave());
        return mapper.fromProducto(productRepository.findByClave(producto.getClave()));
    }

    @Override
    public int guarda(Item producto) {
    productRepository.save(mapper.fromItem(producto));
    return 0;
    }

    /*

    */
    @Override
    public int guardaLista(List <Item> saveList) {
        try {
            String ruta = "/home/vladd/archivos/file.sh";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < saveList.size(); i++) {
                Item itemTemp = existeProducto(saveList.get(i));
                if (itemTemp == null) {
                guarda(saveList.get(i));
                } else {
                    itemTemp.setMoneda(saveList.get(i).getMoneda());
                    itemTemp.setPrecio(saveList.get(i).getPrecio());
                    itemTemp.setDescripcion(saveList.get(i).getDescripcion());
                    itemTemp.setPrecioDescuento(saveList.get(i).getPrecioDescuento());
                    itemTemp.setGrupo(saveList.get(i).getGrupo());
                    itemTemp.setImagen(saveList.get(i).getImagen());
                    guarda(itemTemp);
                }
                bw.write(pythonCommand + " " + saveList.get(i).getImagen() + " " + saveList.get(i).getGrupo() + "\n");
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public Producto getProducto(String clave) {
        ProductMapper mapper = new ProductMapper();
        Producto producto =   productRepository.findByClave(clave);
        Item item = mapper.fromProducto(producto);
        logger.info(" CLAVE {} descripcion {}" , clave, item.getDescripcion());
        return producto;
    }

    @Override
    public Producto getProductoById(Integer idProducto) {
        ProductMapper mapper = new ProductMapper();
        Producto producto =   productRepository.findByIdProducto(idProducto);
        Item item = mapper.fromProducto(producto);
        logger.info(" CLAVE {} descripcion {}" , idProducto, item.getDescripcion());
        return producto;
    }


}

