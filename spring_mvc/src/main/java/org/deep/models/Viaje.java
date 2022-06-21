package org.deep.models;

public class Viaje {
    //Atributos
    private String lugar;

    private String opinion;

    //private Integer puntos;

    public Viaje(String lugar, String opinion, int puntos) {
        this.lugar = lugar;
        this.opinion = opinion;
        //this.puntos = puntos;
    }

    public String getLugar() {
        return lugar;
    }

    @Override
    public String toString() {
        return "Viaje{" +
                "lugar='" + lugar + '\'' +
                ", opinion='" + opinion + '\'' +
                //", puntos=" + puntos +
                '}';
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

    /*public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }*/


}


