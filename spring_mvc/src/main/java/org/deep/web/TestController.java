package org.deep.web;

import org.deep.servicios.GestorUsuariosInf;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;

@Controller
@RequestMapping("/test")
public class TestController {

    @Inject
    GestorUsuariosInf gestorUsuarios;

    //Escucha en metodo get
    @RequestMapping(method = RequestMethod.GET, value = "") //corresponde con ruta anterior /test
    public ModelAndView getTest() {
        ModelAndView mav = new ModelAndView("test");//que me envia la vista .jsp
        mav.addObject("usuarios", gestorUsuarios.getUserById(1L));
        return mav;
    }
}
