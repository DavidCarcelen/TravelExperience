package org.deep.models;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    //Atributos
    private Long id;
    private String nombre;
    private String email;
    private String sobreMi;
    private int edad;
    private String password;
    public List<Fotografia> fotografias = new ArrayList<>();

    //constructor con todos los atributos
    public Usuario(Long id, String nombre, String email, String sobreMi, int edad, String password) {

        this.nombre = nombre;
        this.email = email;
        this.sobreMi = sobreMi;
        this.edad = edad;
        this.password = password;
    }
    //constructor con los atributos que necesitamos para crear un Usuario


    public Usuario(String nombre, String email, String sobreMi, int edad, String password) {
        this.nombre = nombre;
        this.email = email;
        this.sobreMi = sobreMi;
        this.edad = edad;
        this.password = password;
    }

    //getters y setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSobreMi() {
        return sobreMi;
    }

    public void setSobreMi(String sobreMi) {
        this.sobreMi = sobreMi;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //metodo toString


    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", sobreMi='" + sobreMi + '\'' +
                ", edad=" + edad +
                ", password=" + password +
                ", fotografias=" + fotografias +
                '}';
    }

    //metodo crear viajes
    public void crear(){

    }

    //metodo compartir viajes
    public void compartir(){

    }
}
