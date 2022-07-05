package org.deep.persistence;

import org.deep.models.Usuario;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UsuariosManager {
    @PersistenceContext
    private EntityManager em;

    public UsuariosManager() {
    }

    public List<Usuario> getAll() throws Exception {
        List<Usuario> listaU = em.createQuery("FROM Usuario").getResultList();
        return listaU;
    }

    public void addUsuarios(Usuario user) {
    }

    public Usuario getUserporId(Long id) {
        return null;
    }
}