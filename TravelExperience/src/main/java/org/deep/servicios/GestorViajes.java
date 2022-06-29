package org.deep.servicios;

import org.deep.models.Viaje;
import org.deep.persistence.AlmacenViajes;

import java.util.List;

public class GestorViajes {

    AlmacenViajes repo;


    public void setRepo(AlmacenViajes repo) {
        this.repo = repo;
    }

    public List<Viaje> getAllViajes() {
        return repo.getAll();

    }

    public void storeViaje(Viaje viaje) {
        repo.addViaje(viaje);
    }
}
