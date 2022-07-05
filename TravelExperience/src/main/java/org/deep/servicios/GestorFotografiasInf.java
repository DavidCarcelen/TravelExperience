package org.deep.servicios;

import org.deep.models.Fotografia;
import org.deep.persistence.AlmacenFotos;
import org.deep.persistence.FotosManager;

import java.util.List;

public interface GestorFotografiasInf {

    public void setRepoFotos(FotosManager repoFotos);
    public void storePhoto(Fotografia foto);


    public Fotografia getPhotoByLocalizacion(String localizacion);

    List<Fotografia> getListaFotos();
}
