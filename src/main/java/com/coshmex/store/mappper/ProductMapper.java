package com.coshmex.store.mappper;


import com.coshmex.store.model.Item;
import com.coshmex.store.model.Producto;
import com.coshmex.store.model.ProductoShopify;

public class ProductMapper {
    public ProductoShopify fromProduct(Item item) {
        ProductoShopify pShop = new ProductoShopify(item.getDescripcion(), item.getDescripcion(), getBodyHTML(item.getDescripcion()), "cva", item.getGrupo(), "", "true", item.getDescripcion(), "", "", "", "", "", item.getCodigo_fabricante(), "", "", item.getDisponibleCD(), "deny", "manual", getPrecioPublico(item), "", getEnviable(item), "true", "", item.getImagen(), "1", "", "false", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "kg", "", item.getPrecio().toString());
        return pShop;
    }

    public Producto fromItem(Item item) {
        Producto target = new Producto();
        target.setClave(item.getClave());
        target.setDescripcion(item.getDescripcion());
        target.setSolucion(item.getSolucion());
        target.setMarca(item.getMarca());
        target.setCategoria(item.getGrupo());
        target.setPrecio(item.getPrecio());
        target.setMoneda(item.getMoneda());
        target.setExistencia(item.getDisponible());
        target.setImagen(item.getImagen());
        target.setConversion(item.getConversion());
        return target;
    }

    public Item fromProducto(Producto producto) {
        Item item = new Item();
        item.setId(producto.getIdProducto());
        item.setClave(producto.getClave());
        item.setMarca(producto.getMarca());
        item.setDescripcion(producto.getDescripcion());
        item.setDisponible(producto.getExistencia());
        item.setImagen(producto.getImagen());
        item.setPrecio(producto.getPrecio());
        item.setGrupo(producto.getCategoria());
        item.setSolucion(producto.getSolucion());
        item.setMoneda(producto.getMoneda());
        return item;
    }

    public String getBodyHTML(String data) {
        return "<meta charset=\"utf-8\"><span>" + data + "</span>";
    }

    public String getPrecioPublico(Item i) {
        Double d = i.getPrecio();
        Double ganancia = Double.valueOf(1.1D);
        switch (i.getGrupo()) {
            case "AC":
                ganancia = Double.valueOf(1.2D);
                break;
        }
        Double publico = Double.valueOf(d.doubleValue() * ganancia.doubleValue());
        return publico.toString();
    }

    public String getEnviable(Item i) {
        Boolean enviable = Boolean.valueOf(!i.getGrupo().equals("SOFTWARE"));
        return enviable.toString();
    }


}

