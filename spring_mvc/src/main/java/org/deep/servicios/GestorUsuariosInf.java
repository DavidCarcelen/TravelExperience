package org.deep.servicios;

import org.deep.models.Usuario;

public interface GestorUsuariosInf {
    //metodo para obtener usuario por id
    public Usuario getUserById(Long id);

    public void storeUser(Usuario user);

    //metodo para obtener un usuario por su nombre
    public void getUserByName(String name);

}
