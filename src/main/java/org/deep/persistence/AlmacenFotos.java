package org.deep.persistence;

import org.deep.models.Fotografia;

import java.util.ArrayList;
import java.util.List;

public class AlmacenFotos {
    private List<Fotografia> almacenFotos = new ArrayList<>();

    public void addFotos(Fotografia foto){
        almacenFotos.add(foto);
    }

    public int numeroFotos(){
        return almacenFotos.size();
    }

    public List<Fotografia> listadeUsuarios(){
        return almacenFotos;
    }

}
