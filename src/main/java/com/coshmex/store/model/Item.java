package com.coshmex.store.model;


import com.coshmex.store.config.SingletonCurrency;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
//LAYOUT
@XmlRootElement
public class Item implements Serializable {
  private static final long serialVersionUID = 1L;


  private int id;

  private String clave;

  private String codigo_fabricante;

  private String descripcion;

  private String solucion;

  private String grupo;

  private String marca;

  private String garantia;

  private String clase;

  private String disponible;

  private String moneda;

  private String ficha_tecnica;

  private String ficha_comercial;

  private String imagen;

  private String disponibleCD;

  private String TotalDescuento;

  private String MonedaDescuento;

  private String PrecioDescuento;

  private String MonedaPrecioDescuento;

  private String ClavePromocion;

  private String VencimientoPromocion;

  private Double precio;

  private Double conversion;

  public Item() {}

  public Item(int id, String clave, String codigo_fabricante, String descripcion, String solucion, String grupo, String marca, String garantia, String clase, String disponible, String moneda, String ficha_tecnica, String ficha_comercial, String imagen, String disponibleCD, String totalDescuento, String monedaDescuento, String precioDescuento, String monedaPrecioDescuento, String clavePromocion, String vencimientoPromocion, Double conversion) {
    this.id = id;
    this.clave = clave;
    this.codigo_fabricante = codigo_fabricante;
    this.descripcion = descripcion;
    this.solucion = solucion;
    this.grupo = grupo;
    this.marca = marca;
    this.garantia = garantia;
    this.clase = clase;
    this.disponible = disponible;
    this.moneda = moneda;
    this.ficha_tecnica = ficha_tecnica;
    this.ficha_comercial = ficha_comercial;
    this.imagen = imagen;
    this.disponibleCD = disponibleCD;
    this.TotalDescuento = totalDescuento;
    this.MonedaDescuento = monedaDescuento;
    this.PrecioDescuento = precioDescuento;
    this.MonedaPrecioDescuento = monedaPrecioDescuento;
    this.ClavePromocion = clavePromocion;
    this.VencimientoPromocion = vencimientoPromocion;
    this.conversion = conversion;
  }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClave() {
    return this.clave;
  }

  public void setClave(String clave) {
    this.clave = clave;
  }

  public String getCodigo_fabricante() {
    return this.codigo_fabricante;
  }

  public void setCodigo_fabricante(String codigo_fabricante) {
    this.codigo_fabricante = codigo_fabricante;
  }

  public String getDescripcion() {
    return this.descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

    public String getSolucion() {
        return this.solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }

  public String getGrupo() {
    return this.grupo;
  }

  public void setGrupo(String grupo) {
    this.grupo = grupo;
  }

  public String getMarca() {
    return this.marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getGarantia() {
    return this.garantia;
  }

  public void setGarantia(String garantia) {
    this.garantia = garantia;
  }

  public String getClase() {
    return this.clase;
  }

  public void setClase(String clase) {
    this.clase = clase;
  }

  public String getDisponible() {
    return this.disponible;
  }

  public void setDisponible(String disponible) {
    this.disponible = disponible;
  }

  public String getMoneda() {
    return this.moneda;
  }

  public void setMoneda(String moneda) {
    this.moneda = moneda;
  }

  public Double getConversion() {
    return this.conversion;
  }

  public void setConversion(Double conversion) {
    this.conversion = conversion;
  }

  public String getFicha_tecnica() {
    return this.ficha_tecnica;
  }

  public void setFicha_tecnica(String ficha_tecnica) {
    this.ficha_tecnica = ficha_tecnica;
  }

  public String getFicha_comercial() {
    return this.ficha_comercial;
  }

  public void setFicha_comercial(String ficha_comercial) {
    this.ficha_comercial = ficha_comercial;
  }

  public String getImagen() {
    return this.imagen;
  }

  public void setImagen(String imagen) {
    this.imagen = imagen;
  }

  public String getDisponibleCD() {
    return this.disponibleCD;
  }

  public void setDisponibleCD(String disponibleCD) {
    this.disponibleCD = disponibleCD;
  }

  public String getTotalDescuento() {
    return this.TotalDescuento;
  }

  public void setTotalDescuento(String totalDescuento) {
    this.TotalDescuento = totalDescuento;
  }

  public String getMonedaDescuento() {
    return this.MonedaDescuento;
  }

  public void setMonedaDescuento(String monedaDescuento) {
    this.MonedaDescuento = monedaDescuento;
  }

  public String getPrecioDescuento() {
    return this.PrecioDescuento;
  }

  public void setPrecioDescuento(String precioDescuento) {
    this.PrecioDescuento = precioDescuento;
  }

  public String getMonedaPrecioDescuento() {
    return this.MonedaPrecioDescuento;
  }

  public void setMonedaPrecioDescuento(String monedaPrecioDescuento) {
    this.MonedaPrecioDescuento = monedaPrecioDescuento;
  }

  public String getClavePromocion() {
    return this.ClavePromocion;
  }

  public void setClavePromocion(String clavePromocion) {
    this.ClavePromocion = clavePromocion;
  }

  public String getVencimientoPromocion() {
    return this.VencimientoPromocion;
  }

  public void setVencimientoPromocion(String vencimientoPromocion) {
    this.VencimientoPromocion = vencimientoPromocion;
  }

  public Double getPrecio() {
    SingletonCurrency singletonCurrency = SingletonCurrency.getSingletonInstance();
    if (moneda.equals("Dolares")) {
      return precio * singletonCurrency.getCurrency();
    } else {
      return precio;
    }
  }

  public void setPrecio(Double precio) {
    this.precio = precio;
  }

  public String toString() {
    return "Item [id=" + this.id + ", clave=" + this.clave + ", codigo_fabricante=" + this.codigo_fabricante + ", descripcion=" + this.descripcion + ", grupo=" + this.grupo + ", marca=" + this.marca + ", garantia=" + this.garantia + ", clase=" + this.clase + ", disponible=" + this.disponible + ", moneda=" + this.moneda + ", ficha_tecnica=" + this.ficha_tecnica + ", ficha_comercial=" + this.ficha_comercial + ", imagen=" + this.imagen + ", disponibleCD=" + this.disponibleCD + ", TotalDescuento=" + this.TotalDescuento + ", MonedaDescuento=" + this.MonedaDescuento + ", PrecioDescuento=" + this.PrecioDescuento + ", MonedaPrecioDescuento=" + this.MonedaPrecioDescuento + ", ClavePromocion=" + this.ClavePromocion + ", VencimientoPromocion=" + this.VencimientoPromocion + ", precio=" + this.precio + "]";
  }
}
