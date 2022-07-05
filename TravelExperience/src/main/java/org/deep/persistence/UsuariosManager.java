package org.deep.persistence;

import org.deep.models.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class UsuariosManager {
    @PersistenceContext
    private EntityManager em;

    public UsuariosManager() {
    }

    public List<Usuario> getUsuarios() throws Exception {
        List<Usuario> listaU = em.createQuery("FROM Usuario").getResultList();
        return listaU;
    }
}