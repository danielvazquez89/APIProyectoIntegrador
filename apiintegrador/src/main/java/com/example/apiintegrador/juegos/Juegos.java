package com.example.apiintegrador.juegos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "juegos")
public class Juegos {
    @Id
    private int id_producto;
    private String nombre_juego;
    private int id_vendedor;
    private String descripcion_juego;
    private String url_imagen;
    private String genero;
    private float precio;

    public Juegos() {
    }

    public Juegos(int id_producto, String nombre_juego, int id_vendedor, String descripcion_juego, String url_imagen,
            String genero, float precio) {
        this.id_producto = id_producto;
        this.nombre_juego = nombre_juego;
        this.id_vendedor = id_vendedor;
        this.descripcion_juego = descripcion_juego;
        this.url_imagen = url_imagen;
        this.genero = genero;
        this.precio = precio;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_juego() {
        return nombre_juego;
    }

    public void setNombre_juego(String nombre_juego) {
        this.nombre_juego = nombre_juego;
    }

    public int getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public String getDescripcion_juego() {
        return descripcion_juego;
    }

    public void setDescripcion_juego(String descripcion_juego) {
        this.descripcion_juego = descripcion_juego;
    }

    public String getUrl_imagen() {
        return url_imagen;
    }

    public void setUrl_imagen(String url_imagen) {
        this.url_imagen = url_imagen;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

}