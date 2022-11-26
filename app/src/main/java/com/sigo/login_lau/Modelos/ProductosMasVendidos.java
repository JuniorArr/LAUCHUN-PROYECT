package com.sigo.login_lau.Modelos;

public class ProductosMasVendidos {

    Integer id;
    Integer producto;

    public ProductosMasVendidos(Integer id, Integer producto) {
        this.id = id;
        this.producto = producto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProducto() {
        return producto;
    }

    public void setProducto(Integer producto) {
        this.producto = producto;
    }
}
