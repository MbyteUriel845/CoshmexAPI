package com.coshmex.store.controller;

import com.coshmex.store.model.Producto;
import com.coshmex.store.service.ProductsService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
public class ProductsController {
    static private Logger logger = LogManager.getLogger(ProductsController.class);
    @Autowired
    ProductsService productsService;
    @CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
    @RequestMapping(value = {"/rest/getProducts"}, method = {RequestMethod.GET})
    @GetMapping("/rest/getProducts")
    @ResponseBody

    public List<Producto> getCategoria(@RequestParam(value = "categoria", defaultValue = "", required = false) String categoria) {
        logger.info("   CATEGORIA {}   " , categoria);
        return productsService.getProducts(categoria);
    }

    @CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
    @RequestMapping(value = {"/rest/getAllProducts"}, method = {RequestMethod.GET})
    @GetMapping("/rest/getAllProducts")
    @ResponseBody

    public List<Producto> getAllProducts() {
        return productsService.getAllProducts();
    }
}
