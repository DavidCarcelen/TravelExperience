package org.deep.persistence;

import org.deep.models.Usuario;
import java.util.ArrayList;
import java.util.List;

    public class AlmacenUsuarios {
    //atributo
    private List<Usuario> listaUsuarios = new ArrayList<>();

        public List<Usuario> getListaUsuarios() {
            return listaUsuarios;
        }

        public void setListaUsuarios(List<Usuario> listaUsuarios) {
            this.listaUsuarios = listaUsuarios;
        }

        public void addUsuarios(Usuario usuario){
            listaUsuarios.add(usuario);
        }
        
        //metodo de llamar usuario
        public Usuario get(int idx) {
            if(idx>=0 && idx<this.listaUsuarios.size()) {
                return this.listaUsuarios.get(idx);
            }else{
                return null;
            }
        }

        /*
            public Texto get(int idx) {
        if(idx>=0 && idx<this.textos.size()) return this.textos.get(idx);
        else return null;
    }

        */

    public int numeroUsuarios(){
        return listaUsuarios.size();
    }

    public List<Usuario> listadeUsuarios(){
        return listaUsuarios;
    }



    /*public void listaUsuarios(){
        this.listaUsuarios.add(new Usuario("nombre1", "email1@email.com", "descripcion1 sobre mi", 33));
        this.listaUsuarios.add(new Usuario("nombre2", "email2@email.com", "descripcion2 sobre mi", 34));
        this.listaUsuarios.add(new Usuario("nombre3", "email3@email.com", "descripcion3 sobre mi", 35));

    }

    public List<Usuario> getListaUsuarios() {
        return this.listaUsuarios;
    }*/
}
