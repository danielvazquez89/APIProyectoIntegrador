package com.example.apiintegrador.Juegos_Favoritos;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "juegos_favoritos")
@IdClass(RelationshipId.class)
public class Juegos_Favoritos implements Serializable {
    @Id
    private int id_usuario;
    @Id
    private int id_producto;
    private String fecha_like;

    public Juegos_Favoritos() {
    }

    public Juegos_Favoritos(int id_usuario, int id_producto, String fecha_like) {
        this.id_usuario = id_usuario;
        this.id_producto = id_producto;
        this.fecha_like = fecha_like;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getFecha_like() {
        return fecha_like;
    }

    public void setFecha_like(String fecha_like) {
        this.fecha_like = fecha_like;
    }

}

class RelationshipId implements Serializable {
    private int id_usuario;
    private int id_producto;

    public RelationshipId(int id_usuario, int id_producto) {
        this.id_usuario = id_usuario;
        this.id_producto = id_producto;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    // Getter and Setter
}