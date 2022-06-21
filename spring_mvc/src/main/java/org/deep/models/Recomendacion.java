package org.deep.models;

public class Recomendacion {

    private String lugar;

    private String opinion;

    private int puntos;

    public Recomendacion(String lugar, String opinion, int puntos) {
        this.lugar = lugar;
        this.opinion = opinion;
        this.puntos = puntos;
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

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "Recomendacion{" +
                "lugar='" + lugar + '\'' +
                ", opinion='" + opinion + '\'' +
                ", puntos=" + puntos +
                '}';
    }
    /*public boolean isValid(){
        if(lugar!=null && opinion !=null && puntos>0 && puntos<=5) return true;
        else return false;
    }*/
}

