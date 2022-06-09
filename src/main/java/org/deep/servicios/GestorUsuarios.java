package org.deep.servicios;

import org.deep.models.Usuario;
import org.deep.persistence.AlmacenUsuarios;

public class GestorUsuarios implements GestorUsuariosInf {
    //atributos
    private AlmacenUsuarios listaUsers;

    public AlmacenUsuarios getAlmacenUsuarios() {
        return listaUsers;
    }

    public void setAlmacenUsuarios(AlmacenUsuarios almacenUsuarios) {
        this.listaUsers = almacenUsuarios;
    }

    //metodos
    @Override
    public Usuario getUserById(Long id) {
        if(id > 0){
            return listaUsers.getUserporId(id);//desde aqui llamamos al metodo getUserporId de la clase Almacen de usuarios
        }else{
            return null;
        }
    }

    @Override
    public void storeUser(Usuario user) {
        listaUsers.addUsuarios(user);
    }

    @Override
    public void getUserByName(String name) {

    }
}
