package org.deep;

import org.deep.models.Fotografia;
import org.deep.models.Usuario;
import org.deep.persistence.AlmacenUsuarios;
import org.deep.persistence.AlmacenUsuariosInf;
import org.deep.servicios.GestorUsuarios;

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
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        StudentServiceInf servicioEstudiantes = context.getBean(StudentServiceInf.class);

        Student unEstudiante = servicioEstudiantes.getStudentByIndex(3);
        System.out.println(unEstudiante);

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
