package com.example.apiintegrador.chat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "chat")
public class Chat {
    @Id
    private int id_chat;
    private int id_usuario;
    private int id_producto;
    private int id_vendedor;

    public Chat() {
    }

    public Chat(int id_chat, int id_usuario, int id_producto, int id_vendedor) {
        this.id_chat = id_chat;
        this.id_usuario = id_usuario;
        this.id_producto = id_producto;
        this.id_vendedor = id_vendedor;
    }

    public int getId_chat() {
        return id_chat;
    }

    public void setId_chat(int id_chat) {
        this.id_chat = id_chat;
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

    public int getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

}
