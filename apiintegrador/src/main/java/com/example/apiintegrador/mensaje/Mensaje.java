package com.example.apiintegrador.mensaje;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mensaje")
public class Mensaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_mensaje;
    private String contenido_mensaje;
    private int id_chat;

    public Mensaje() {
    }

    public Mensaje(String contenido_mensaje, int id_chat) {
        //this.id_mensaje = id_mensaje;
        this.contenido_mensaje = contenido_mensaje;
        this.id_chat = id_chat;
    }

    public int getId_mensaje() {
        return id_mensaje;
    }

    public void setId_mensaje(int id_mensaje) {
        this.id_mensaje = id_mensaje;
    }

    public String getContenido_mensaje() {
        return contenido_mensaje;
    }

    public void setContenido_mensaje(String contenido_mensaje) {
        this.contenido_mensaje = contenido_mensaje;
    }

    public int getId_chat() {
        return id_chat;
    }

    public void setId_chat(int id_chat) {
        this.id_chat = id_chat;
    }

}
