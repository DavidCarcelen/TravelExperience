package org.deep.persistence;

import org.deep.models.Fotografia;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AlmacenFotos implements AlmacenFotosInf{
    private List<Fotografia> almacenFotos = new ArrayList<>();

    public AlmacenFotos() {
        almacenFotos.add(new Fotografia("Foto1", "2022-06-01", "Francia", "https://www.foto1"));
        almacenFotos.add(new Fotografia("Foto2", "2022-03-01", "Perú", "https://www.foto2"));
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
