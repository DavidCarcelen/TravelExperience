package org.deep.persistence;

import org.deep.models.Usuario;
import org.deep.models.Viaje;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
public class ViajesManager {
    @PersistenceContext
    private EntityManager em;

    public ViajesManager() {
    }

    /**
     * Devuelve la lista de viajes de bbdd
     * @return
     * @throws Exception
     */
    public List<Viaje> getAll() throws Exception {
        List<Viaje> listaV = em.createQuery("FROM Viaje").getResultList();
        return listaV;
    }



    /**
     * Metodo que añade un viaje
     * @param viaje
     */
    public void addViaje(Viaje viaje) {
    }
}