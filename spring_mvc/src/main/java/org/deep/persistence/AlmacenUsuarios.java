package org.deep.persistence;

import org.deep.models.Usuario;

import java.util.ArrayList;
import java.util.List;

public class AlmacenUsuarios {
    //atributo
    private static List<Usuario> listaUsuarios = new ArrayList<>();
    static{
        listaUsuarios.add(new Usuario("nombre1", "nombre1@email.com","sobre mi nombre1", 33, "222" ));
        listaUsuarios.add(new Usuario("nombre2", "nombre2@email.com","sobre mi descripcion 2",34, "333" ));
        listaUsuarios.add(new Usuario("nombre3", "nombre3@email.com","descripcion nombre3", 35, "444" ));
    }

    //metodo para añadir Usuarios al almacen de Usuarios
   List<Usuario> usuarios = listaUsuarios;



    public static boolean addUsuarios(Usuario usuario) {
        listaUsuarios.add(usuario);
        return true;
    }

    //metodo de llamar usuario por el indice
    public Usuario get(int idx) {
        if (idx >= 0 && idx < this.listaUsuarios.size()) {
            return this.listaUsuarios.get(idx);
        } else {
            return null;
        }
    }

    //Metodo que devuelve la lista de USUArios
    public static List<Usuario> getAll() {
        return listaUsuarios;
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
