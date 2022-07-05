package org.deep.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.*;

@Entity
@Table
public class Viaje {
    //Atributos
    @Column
    @NotNull(message = "Lugar debe tener un valor")
    @NotBlank(message = "Lugar debe tener un valor")
    @NotEmpty(message = "Lugar debe tener un valor")
    private String lugar;

    @Column
    @NotNull(message = "Opinion debe tener un valor")
    @NotBlank(message = "Opinion debe tener un valor")
    @NotEmpty(message = "Opinion debe tener un valor")
    private String opinion;
    @Column
    @Min(value=1)
    @Max(value=5)
    private int puntuacion;

    public Viaje(String lugar, String opinion, int puntuacion) {
        this.lugar = lugar;
        this.opinion = opinion;
        this.puntuacion = puntuacion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "Viaje{" +
                "lugar='" + lugar + '\'' +
                ", opinion='" + opinion + '\'' +
                ", puntuacion=" + puntuacion +
                '}';
    }

    public Viaje() {
    }

    /*public boolean isValid(){
        if (this.lugar!=null && this.opinion!=null && this.puntuacion >0 && this.puntuacion <6 )
            return true;
        else return false;
    }*/
}






