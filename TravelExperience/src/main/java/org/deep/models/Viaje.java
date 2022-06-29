package org.deep.models;

public class Viaje {
    //Atributos
    private String lugar;
    private String opinion;
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
}






