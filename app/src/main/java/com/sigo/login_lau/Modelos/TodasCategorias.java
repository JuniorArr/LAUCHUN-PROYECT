package com.sigo.login_lau.Modelos;

public class TodasCategorias {

    Integer id;
    Integer categoria;

    public TodasCategorias(Integer id, Integer categoria) {
        this.id = id;
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }
}
