package org.deep.web;

import org.deep.models.Usuario;
import org.deep.persistence.AlmacenUsuarios;
import org.deep.servicios.GestorUsuariosInf;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;
import java.util.List;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @Inject
    AlmacenUsuarios repositorioUsuarios;//injectamos de Almacen de usuarios

    //Escucha en metodo get
    @RequestMapping(method = RequestMethod.GET, value="") //corresponde con ruta anterior /test
    public ModelAndView getTest(){
        ModelAndView mav = new ModelAndView("test");//que me envia la vista .jsp
        mav.addObject("usuarios", repositorioUsuarios.getUserporId(1L));
        return mav;
    }

    /**
     * Metodo para la lista de usuarios,Obtenemos la lista de usuarios del AlmacenUsuarios
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value="/lista")
    public ModelAndView lista_de_coches(){
        List<Usuario> listaUsuarios = repositorioUsuarios.getAll();
        ModelAndView mav = new ModelAndView("listaUsuarios");//Le indicamos la ruta al jsp, en este caso listaUsuairos.jsp
        mav.addObject("listaUsuarios", listaUsuarios); //enviamos al jsp este objeto
        mav.addObject("message", "Usuarios Travel Experience");//enviamos a jsp este objeto
        return mav;
    }

    /**
     * Metodo para dar de alta a un usuario. en la url http://localhost:8080/TravelExperienceMVC/web/test/alta
     * @return mav, nos retorna la plantilla jsp
     */
    @RequestMapping(method = RequestMethod.GET, value="/alta") //corresponde con ruta anterior /test
    public ModelAndView enviar_form_usuario(){
        ModelAndView mav = new ModelAndView("altaUsuarios");//se envia a al plantilla altaUsuarios.jsp
        mav.addObject("mensaje", "Formulario de alta");//objeto que se envia a la palntilla altaUsuarios.jsp
        return mav;
    }


    @RequestMapping(method = RequestMethod.POST,value = "/alta")//corresponde a la ruta de la URL
    public ModelAndView recibir_form_usuario(UsuarioForm formUsuario){
        System.out.println("entra en form");
        //System.out.println(formUsuario);//prueba para ver si recibimos los datos del formulario de la clase UsuarioForm
        ModelAndView mav = null;

        if(formUsuario.validate()){ //si el usuario es valido
            Usuario nuevoUsuario = null; //Declaramos variable a nulo;
            nuevoUsuario = formUsuario.toUsuario();
            AlmacenUsuarios.addUsuarios(nuevoUsuario);//añadimos el nuevo usuario al Almacen de usuarios
            mav = new ModelAndView("redirect:./lista"); //enviamos el nuevo usuario a la lista.jsp
            //System.out.println(formUsuario);
        }else{ //si el usuario no es valido lo enviamos al formulario
            mav = new ModelAndView("altaUsuarios");//misma ruta que el metodo GET, envio al formulario
            mav.addObject("error", "Rellenar todos los campos");//mensaje de error
            mav.addObject("unUsuario", formUsuario);//pasamos el objeto
        }

        return mav;
    }

}
