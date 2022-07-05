package org.deep.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class Fotografia {
    //Atributos
    @Column
    @NotNull(message = "Descripción debe tener un valor")
    @NotBlank(message = "Descripción debe tener un valor")
    @NotEmpty(message = "Descripción debe tener un valor")
    private String descripcion;
    @Column
    @NotNull(message = "Fecha debe tener un valor")
    @NotBlank(message = "Fecha debe tener un valor")
    @NotEmpty(message = "Fecha debe tener un valor")
    private String fecha;
    @Column
    @NotNull(message = "Localización debe tener un valor")
    @NotBlank(message = "Localización debe tener un valor")
    @NotEmpty(message = "Descripción debe tener un valor")
    private String localizacion;

    @Column
    @NotNull(message = "Url debe tener un valor")
    @NotBlank(message = "Url debe tener un valor")
    @NotEmpty(message = "Url debe tener un valor")
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
        if (this.descripcion != null && this.descripcion.length() > 3 &&
                this.localizacion != null && this.localizacion.length() > 3 &&
                this.url != null && this.url.length() > 3
        ) return true;
        else return false;
    }
}
