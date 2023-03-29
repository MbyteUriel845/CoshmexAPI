package com.coshmex.store.service;

import com.coshmex.store.model.Item;
import com.coshmex.store.model.Producto;

import java.util.List;

public interface ProductsService {

        List<Producto> getProducts(String categoria);

        List<Producto> getAllProducts();
}
