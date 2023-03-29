package com.coshmex.store.controller;

import com.coshmex.store.model.Producto;
import com.coshmex.store.repository.ProductRepository;
import com.coshmex.store.service.ProductoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.rmi.ServerException;

@RestController
public class ProductoController {
    static private Logger logger = LogManager.getLogger(ProductoController.class);
    @Autowired
    ProductoService productoService;

    @Autowired
    ProductRepository productRepository;

    @CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
    @RequestMapping(value = {"/rest/getProduct"}, method = {RequestMethod.GET})
    @GetMapping("/rest/getProduct")
    @ResponseBody

    public Producto getProducto(HttpServletRequest request,
                                @RequestParam(value = "idProducto", defaultValue = "", required = false) Integer idProducto) {

        logger.info("   CLAVE {}  " , idProducto);

        return productoService.getProductoById(idProducto);
    }

    @PostMapping(path = "nuevo-producto",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Producto> create (@RequestBody Producto product) throws IOException, ServerException {
        productRepository.save(product);
        if (product == null) {
            throw new ServerException("Error al crear el producto");
        } else {
            return ResponseEntity.ok(product);
        }
    }
}
