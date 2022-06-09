package org.deep.models;

import java.util.Date;

public class Fotografia {
    //Atributos
    private String descripcion;
    private Date fecha;
    private String localizacion;
//constructor

    public Fotografia(String descripcion, Date fecha, String localizacion) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.localizacion = localizacion;

    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
}
