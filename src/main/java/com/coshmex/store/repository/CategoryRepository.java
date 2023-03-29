package com.coshmex.store.repository;

import com.coshmex.store.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Producto, String> {

    @Query(value = "SELECT DISTINCT u.categoria FROM Producto u")
    List <String> findDistinctCategoria(String categoria);

}



