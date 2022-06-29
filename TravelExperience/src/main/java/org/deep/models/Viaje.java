package org.deep.models;

import javax.validation.constraints.*;

public class Viaje {
    //Atributos
    @NotNull(message = "Lugar debe tener un valor")
    @NotBlank(message = "Lugar debe tener un valor")
    @NotEmpty(message = "Lugar debe tener un valor")
    private String lugar;

    @NotNull(message = "Opinion debe tener un valor")
    @NotBlank(message = "Opinion debe tener un valor")
    @NotEmpty(message = "Opinion debe tener un valor")
    private String opinion;
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






