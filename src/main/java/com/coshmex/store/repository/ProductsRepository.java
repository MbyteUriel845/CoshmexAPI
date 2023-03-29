package com.coshmex.store.repository;

import com.coshmex.store.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository<Producto, String> {

    @Query(value = "SELECT u FROM Producto u WHERE u.categoria = ?1")
    List<Producto> findByCategoria(String categoria);

    List<Producto> findAll();
}
