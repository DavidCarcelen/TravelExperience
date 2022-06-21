package org.deep.servicios;

import org.deep.models.Fotografia;
import org.deep.persistence.AlmacenFotos;

public class GestorFotografias implements GestorFotografiasInf{

    private AlmacenFotos listaFotos;

    public AlmacenFotos getListaFotos(){
        return listaFotos;
    }

    public void setListaFotos(AlmacenFotos listaFotos) {
        this.listaFotos = listaFotos;
    }

    public void storePhoto(Fotografia foto){
        listaFotos.addFotos(foto);
    }

    public Fotografia getPhotoByLocalizacion(String localizacion){
        if(!localizacion.equals("")){
            return listaFotos.getPhotoByLugar(localizacion);
        }else {
            return null;
        }

    }
    
}
