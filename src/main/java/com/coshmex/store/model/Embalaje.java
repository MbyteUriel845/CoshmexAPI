/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coshmex.store.model;


import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author vladd
 */
@Entity
@Table(name = "Embalaje")
public class Embalaje implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idEmbalaje")
    private Integer idEmbalaje;

    @JoinColumn(name = "idUnidad", referencedColumnName = "idUnidad")
    @ManyToOne
    private Unidad idUnidad;

    @JoinColumn(name = "idProducto", referencedColumnName = "idProducto")
    @ManyToOne
    private Producto idProducto;

    @Column(name = "cantidad_embajale")
    private Integer cantidad_embajale;

    @Column(name = "cantidad_unitario")
    private Integer cantidad_unitario;


}
