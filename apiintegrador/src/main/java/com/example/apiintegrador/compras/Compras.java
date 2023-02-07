package com.example.apiintegrador.compras;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "compras")
public class Compras {
    @Id
    private int id_compra;
    private int id_usuario;
    private int id_vendedor;
    private int id_producto;
    private String fecha_compra;

    public Compras() {
    }

    public Compras(int id_compra, int id_usuario, int id_vendedor, int id_producto, String fecha_compra) {
        this.id_compra = id_compra;
        this.id_usuario = id_usuario;
        this.id_vendedor = id_vendedor;
        this.id_producto = id_producto;
        this.fecha_compra = fecha_compra;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdCompra() {
        return id_compra;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
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

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(String fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

}
