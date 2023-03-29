package com.coshmex.store.repository;

import com.coshmex.store.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Producto, String> {
    @Query(value = "SELECT u FROM Producto u WHERE u.clave = ?1")
    Producto findByClave (String clave);

    @Query(value = "SELECT u FROM Producto u WHERE u.idProducto = ?1")
    Producto findByIdProducto (Integer idProducto);

}
