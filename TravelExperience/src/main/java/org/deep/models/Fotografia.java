package org.deep.models;

import java.util.Date;

public class Fotografia {
    //Atributos
    private String descripcion;
    private String fecha;
//    private Date fecha = new Date();
    private String localizacion;

    private String url;

    public Fotografia(String descripcion, String fecha, String localizacion, String url) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.localizacion = localizacion;
        this.url = url;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Fotografia{" +
                "descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                ", localizacion='" + localizacion + '\'' +
                ", url='" + url + '\'' +
                '}';
    }


    public boolean isValid() {
        if(this.descripcion != null && this.descripcion.length() > 3 &&
            this.localizacion != null && this.localizacion.length() > 3 &&
            this.url != null && this.url.length() > 3
        ) return true;
        else return false;
    }
}
