package org.deep.persistence;

import org.deep.models.Fotografia;

import java.util.List;

public interface AlmacenFotosInf {

    public void addFotos(Fotografia foto);
    public int numeroFotos();
    public List<Fotografia> getAllPhotos();
}
