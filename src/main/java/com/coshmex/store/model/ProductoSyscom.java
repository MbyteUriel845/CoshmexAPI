package com.coshmex.store.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "productos")
public class ProductoSyscom implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer idProducto;

    private String modelo;

    private String marca;

    @Column(unique = true, nullable = false)
    private String titulo;
    private String existencia;
    private String en_camino;
    private Double precio_listaUSD;
    private Double precio_especial;
    private String url_imagen;
    private String link__syscom;
    private String Link_privado;
    private String descripcion_fiscal;
    private String codigo_fiscal;

    public Integer getIdProducto () {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getExistencia(String disponible) {
        return existencia;
    }

    public void setExistencia(String existencia) {
        this.existencia = existencia;
    }

    public String getEn_camino() {
        return en_camino;
    }

    public void setEn_camino(String en_camino) {
        this.en_camino = en_camino;
    }

    public Double getPrecio_listaUSD() {
        return precio_listaUSD;
    }

    public void setPrecio_listaUSD(Double precio_listaUSD) {
        this.precio_listaUSD = precio_listaUSD;
    }

    public Double getPrecio_especial() {
        return precio_especial;
    }

    public void setPrecio_especial(Double precio_especial) {
        this.precio_especial = precio_especial;
    }

    public String getUrl_imagen() {
        return url_imagen;
    }

    public void setUrl_imagen(String url_imagen) {
        this.url_imagen = url_imagen;
    }

    public String getLink__syscom() {
        return link__syscom;
    }

    public void setLink__syscom(String link__syscom) {
        this.link__syscom = link__syscom;
    }

    public String getLink_privado() {
        return Link_privado;
    }

    public void setLink_privado(String link_privado) {
        Link_privado = link_privado;
    }

    public String getDescripcion_fiscal() {
        return descripcion_fiscal;
    }

    public void setDescripcion_fiscal(String descripcion_fiscal) {
        this.descripcion_fiscal = descripcion_fiscal;
    }

    public String getCodigo_fiscal() {
        return codigo_fiscal;
    }

    public void setCodigo_fiscal(String codigo_fiscal) {
        this.codigo_fiscal = codigo_fiscal;
    }


}
