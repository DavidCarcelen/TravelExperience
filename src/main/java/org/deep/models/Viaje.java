package org.deep.models;

import java.util.ArrayList;
import java.util.List;

public class Viaje {
    //Atributos
    private String nombre;
    private List<Sitio> listaSitios = new ArrayList<>();

//constructor

    public Viaje(String nombre) {
        this.nombre = nombre;
        //this.sitio = sitio;

    }

    public String getNombre() {
        return nombre;
    }

    //public void setDescripcion(String descripcion) {
     //   this.descripcion = descripcion;
    }


