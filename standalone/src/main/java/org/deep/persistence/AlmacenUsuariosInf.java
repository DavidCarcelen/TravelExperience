package org.deep.persistence;

import org.deep.models.Usuario;

import java.util.List;

public interface AlmacenUsuariosInf {
    public void addUsuarios(Usuario usuario);
    public Usuario get(int idx);
    public List<Usuario> getAll();
    public int numeroUsuarios();
    public void AlmacenUsuarios();
    public Usuario getUserporId(Long id);
}
