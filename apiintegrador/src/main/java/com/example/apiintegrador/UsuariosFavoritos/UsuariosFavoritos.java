package com.example.apiintegrador.UsuariosFavoritos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios_favoritos")
@IdClass(RelationshipId.class)
public class UsuariosFavoritos implements Serializable {
    @Id
    private int id_usuario;
    @Id
    private int id_vendedor;
    private String fecha_like;

    public UsuariosFavoritos() {
    }

    public UsuariosFavoritos(int id_usuario, int id_vendedor, String fecha_like) {
        this.id_usuario = id_usuario;
        this.id_vendedor = id_vendedor;
        this.fecha_like = fecha_like;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getFecha_like() {
        return fecha_like;
    }

    public void setFecha_like(String fecha_like) {
        this.fecha_like = fecha_like;
    }

    public int getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

}

class RelationshipId implements Serializable {
    private int id_usuario;
    private int id_vendedor;

    public RelationshipId(int id_usuario, int id_vendedor) {
        this.id_usuario = id_usuario;
        this.id_vendedor = id_vendedor;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

}