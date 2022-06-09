package org.deep;

import org.deep.models.Fotografia;
import org.deep.models.Usuario;
import org.deep.persistence.AlmacenUsuarios;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    //instanciamos un objeto de la clase Almacen de Usuarios
    static AlmacenUsuarios almacenUsuarios = new AlmacenUsuarios();
    public static void main( String[] args )
    {
        //instanciar objetos de la clase usuario
        Usuario usu1 = new Usuario("nombre1", "email1@email.com", "descripcion1 sobre mi", 33);
        Usuario usu2 = new Usuario("nombre2", "email2@email.com", "descripcion2 sobre mi", 34);
        Usuario usu3 = new Usuario("nombre3", "email3@email.com", "descripcion3 sobre mi", 35);

        //intanciar objetos de la clase AlmacenUsuarios
        AlmacenUsuarios alm1  = new AlmacenUsuarios();

        //añadir usuarios al arrayList
        alm1.addUsuarios(usu1);
        alm1.addUsuarios(usu2);
        alm1.addUsuarios(usu3);
        //printa el numero total de usuarios
        System.out.println(alm1.numeroUsuarios());
        //printa la lista de usuarios
        System.out.println(alm1.listadeUsuarios());

    }
    //crear metodo para subir Foto
    public void subirFoto(){
        Fotografia lafoto = new Fotografia("Foto Paris", new Date(2022-06-01), "localizacion1");
        Usuario usuario1 = almacenUsuarios.get(1);
        usuario1.fotografias.add(lafoto);
        //AlmacenFotos.add(lafoto);
    }
}
