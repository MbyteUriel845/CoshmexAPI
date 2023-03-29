package com.coshmex.store.service;


import com.coshmex.store.model.Producto;
import com.coshmex.store.repository.ProductsRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService {

    static private Logger logger = LogManager.getLogger(ProductsServiceImpl.class);

    @Autowired
    ProductsRepository productsRepository;

    @Override
    public List<Producto> getProducts(String categoria) {
        return productsRepository.findByCategoria(categoria);
    }
    @Override
    public List<Producto> getAllProducts() {
        return productsRepository.findAll();
    }
}
