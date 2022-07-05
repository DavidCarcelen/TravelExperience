package org.deep.servicios;

import org.deep.models.Viaje;
import org.deep.persistence.AlmacenViajes;
import org.deep.persistence.ViajesManager;

import java.util.List;

public class GestorViajes {

    ViajesManager repoViajes;


    public void setRepo(ViajesManager repo) {
        repoViajes = repo;
    }

    public List<Viaje> getAllViajes() {
        try {
            return repoViajes.getAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public void storeViaje(Viaje viaje) {
        repoViajes.addViaje(viaje);
    }
}
