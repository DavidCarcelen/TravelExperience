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

    /**
     * Devuelve la lista de fotos de la bbdd
     * @return
     * @throws Exception
     */
    public List<Fotografia> getFotos() throws Exception{
        List<Fotografia> listaF = em.createQuery("FROM Fotografia").getResultList();
        return listaF;
    }

    public void addFotos(Fotografia foto) {
    }

    public Fotografia getPhotoByLugar(String localizacion) {
        return null;
    }
}