package com.sigo.login_lau.Modelos;

import android.os.Parcel;
import android.os.Parcelable;

public class ProductosEnCategoria implements Parcelable {

    private int id;
    private int imagen;
    private String nombre, Descripcion, Marca, Precio;

    protected ProductosEnCategoria(Parcel in) {
        id = in.readInt();
        imagen = in.readInt();
        nombre = in.readString();
        Descripcion = in.readString();
        Marca = in.readString();
        Precio = in.readString();
    }

    public static final Creator<ProductosEnCategoria> CREATOR = new Creator<ProductosEnCategoria>() {
        @Override
        public ProductosEnCategoria createFromParcel(Parcel in) {
            return new ProductosEnCategoria(in);
        }

        @Override
        public ProductosEnCategoria[] newArray(int size) {
            return new ProductosEnCategoria[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String precio) {
        Precio = precio;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeInt(imagen);
        parcel.writeString(nombre);
        parcel.writeString(Descripcion);
        parcel.writeString(Marca);
        parcel.writeString(Precio);
    }

    public ProductosEnCategoria(int id, int imagen, String nombre, String descripcion, String marca, String precio) {
        this.id = id;
        this.imagen = imagen;
        this.nombre = nombre;
        this.Descripcion = descripcion;
        this.Marca = marca;
        this.Precio = precio;
    }
}
