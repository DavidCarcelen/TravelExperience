package org.deep.models;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    //Atributos
    private String nombre;
    private String email;
    private String sobreMi;
    private int edad;
    public List<Fotografia> fotografias = new ArrayList<>();

    //constructor

    public Usuario(String nombre, String email, String sobreMi, int edad) {
        this.nombre = nombre;
        this.email = email;
        this.sobreMi = sobreMi;
        this.edad = edad;
    }

    //getters y setters

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

    //metodo toString


    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", sobreMi='" + sobreMi + '\'' +
                ", edad=" + edad +
                '}';
    }
    //metodo crear viajes
    public void crear(){

    }

    //metodo compartir viajes
    public void compartir(){

    }
}
