package com.example.apiintegrador.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class User {
    @Id
    private int id_usuario;
    private String nombre;
    private String apellidos;
    private String mail;
    private String contrasena;
    private String direccion;
    private int codigo_postal;
    private String ciudad;
    private String fecha_nacimiento;
    private float saldo_monedero;

    public User() {
    }

    public User(int id_usuario, String nombre, String lastName, String mail, String contrasena, String direccion,
            int codigoPostal, String ciudad, String fechaNacimiento) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellidos = lastName;
        this.mail = mail;
        this.contrasena = contrasena;
        this.direccion = direccion;
        this.codigo_postal = codigoPostal;
        this.ciudad = ciudad;
        this.fecha_nacimiento = fechaNacimiento;
        this.saldo_monedero = 0;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String firstName) {
        this.nombre = firstName;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String lastName) {
        this.apellidos = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(int codigoPostal) {
        this.codigo_postal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fechaNacimiento) {
        this.fecha_nacimiento = fechaNacimiento;
    }

    public float getSaldo_monedero() {
        return saldo_monedero;
    }

    public void setSaldo_monedero(float saldo_monedero) {
        this.saldo_monedero = saldo_monedero;
    }

    // other setters and getters
}
