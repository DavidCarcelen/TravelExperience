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

    public List<Viaje> getViajes() throws Exception {
        List<Viaje> listaV = em.createQuery("FROM Viajes").getResultList();
        return listaV;
    }
}