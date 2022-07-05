package org.deep.persistence;

import org.deep.models.Fotografia;
import org.deep.models.Usuario;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
public class FotosManager {
    @PersistenceContext
    private EntityManager em;

    public FotosManager() {
    }

    public List<Fotografia> getFotos() throws Exception {
        List<Fotografia> listaF = em.createQuery("FROM Fotografia").getResultList();
        return listaF;
    }
}