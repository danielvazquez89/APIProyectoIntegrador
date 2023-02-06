package com.example.apiintegrador.generos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "generos")
public class Generos {
    @Id
    private String tipo_genero;
    private String url_imagen;

    public Generos() {
    }

    public Generos(String tipo_genero, String url_imagen) {
        this.tipo_genero = tipo_genero;
        this.url_imagen = url_imagen;
    }

    public String getTipo_genero() {
        return tipo_genero;
    }

    public void setTipo_genero(String tipo_genero) {
        this.tipo_genero = tipo_genero;
    }

    public String getUrl_imagen() {
        return url_imagen;
    }

    public void setUrl_imagen(String url_imagen) {
        this.url_imagen = url_imagen;
    }

}