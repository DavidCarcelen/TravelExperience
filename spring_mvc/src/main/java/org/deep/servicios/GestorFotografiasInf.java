package org.deep.servicios;

import org.deep.models.Fotografia;
import org.deep.persistence.AlmacenFotos;

public interface GestorFotografiasInf {
    public AlmacenFotos getListaFotos();
    public void storePhoto(Fotografia foto);
    public void setListaFotos(AlmacenFotos listaFotos);
}
