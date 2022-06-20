package org.deep;

import org.deep.config.Configuracion;
import org.deep.models.Fotografia;
import org.deep.models.Usuario;
import org.deep.persistence.AlmacenUsuarios;
import org.deep.servicios.GestorUsuariosInf;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
        ApplicationContext context = new AnnotationConfigApplicationContext(Configuracion.class);

        GestorUsuariosInf gestorUsuarios = context.getBean(GestorUsuariosInf.class);

        Usuario newUser = new Usuario(0L,"nombre23", "nom23@email.com", "descripcion3", 35);
        gestorUsuarios.storeUser(newUser);

        Usuario unUsuario = gestorUsuarios.getUserById(3L);
        System.out.println(unUsuario);

        //Llamar a contexto de spring, config spring(@Bean)

        //Pedir bean de gestor Usuarios

        //Pasar un nuevo usuario a almacenar




    }

    //crear metodo para subir Foto
    public void subirFoto(){
        Fotografia lafoto = new Fotografia("Foto Paris", new Date(2022-06-01), "localizacion1");
        Usuario usuario1 = almacenUsuarios.get(1);
        usuario1.fotografias.add(lafoto);
        //AlmacenFotos.add(lafoto);
    }
}
