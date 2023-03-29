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
@Table(name = "Unidad")
public class Unidad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idUnidad")
    private Integer idUnidad;
    @Column(name = "descripcion")
    private String descripcion;

    public Integer getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(Integer idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
