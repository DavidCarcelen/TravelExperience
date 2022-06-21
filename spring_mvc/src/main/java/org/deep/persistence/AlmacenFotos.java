package org.deep.persistence;

import org.deep.models.Fotografia;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AlmacenFotos implements AlmacenFotosInf{
    private List<Fotografia> almacenFotos = new ArrayList<>();

    public AlmacenFotos() {
        almacenFotos.add(new Fotografia("Foto1", new Date(2022-06-01), "Francia"));
        almacenFotos.add(new Fotografia("Foto2", new Date(2022-03-01), "Perú"));
    }

    public Fotografia getPhotoByLugar(String localizacion){
        for(Fotografia foto: almacenFotos){
            if(foto.getLocalizacion() == localizacion){
                return foto;
            }
        }
        return null;
    }

    public void addFotos(Fotografia foto){
        almacenFotos.add(foto);
    }

    public int numeroFotos(){
        return almacenFotos.size();
    }

    public List<Fotografia> getAllPhotos(){
        return almacenFotos;
    }

}
