package org.deep.servicios;

import org.deep.models.Fotografia;
import org.deep.persistence.AlmacenFotos;

import java.util.List;

public interface GestorFotografiasInf {
    public List<Fotografia> getListaFotos();

        public void storePhoto(Fotografia foto);
    public void setListaFotos(AlmacenFotos listaFotos);

    public Fotografia getPhotoByLocalizacion(String localizacion);
}
