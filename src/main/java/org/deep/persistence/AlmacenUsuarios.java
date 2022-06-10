package org.deep.persistence;

import org.deep.models.Usuario;

import java.util.ArrayList;
import java.util.List;

public class AlmacenUsuarios {
    //atributo
    private List<Usuario> listaUsuarios = new ArrayList<>();

    //metodo para añadir Usuarios al almacen de Usuarios
    public AlmacenUsuarios() {
        listaUsuarios.add(new Usuario(1L, "nombre1", "email1@email.com", "descripcion1", 25));
        listaUsuarios.add(new Usuario(2L, "nombre2", "email2@email.com", "descripcion2", 30));
    }

    public void addUsuarios(Usuario usuario) {
        usuario.setId((long)listaUsuarios.size()+1);
        listaUsuarios.add(usuario);
    }

    //metodo de llamar usuario por el indice
    public Usuario get(int idx) {
        if (idx >= 0 && idx < this.listaUsuarios.size()) {
            return this.listaUsuarios.get(idx);
        } else {
            return null;
        }
    }

    //
    public List<Usuario> getAll() {
        return this.listaUsuarios;
    }


    //metod que devuelve el tamaño del almacen de usuarios
    public int numeroUsuarios() {
        return listaUsuarios.size();
    }


    //metodo del getUserById
    public Usuario getUserporId(Long id) {
        for (Usuario user : listaUsuarios) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }


}
