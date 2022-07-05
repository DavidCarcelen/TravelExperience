package org.deep.servicios;

import org.deep.models.Usuario;
import org.deep.persistence.AlmacenUsuarios;
import org.deep.persistence.UsuariosManager;


public class GestorUsuarios implements GestorUsuariosInf {
    //atributos
    private UsuariosManager repo;

    public void setRepo(UsuariosManager repo) {
        this.repo = repo;
    }

    //metodos
    @Override
    public Usuario getUserById(Long id) {
        if(id > 0){
            return repo.getUserporId(id);//desde aqui llamamos al metodo getUserporId de la clase Almacen de usuarios
        }else{
            return null;
        }
    }

    @Override
    public void storeUser(Usuario user) {
        repo.addUsuarios(user);
    }

    @Override
    public void getUserByName(String name) {

    }
}
