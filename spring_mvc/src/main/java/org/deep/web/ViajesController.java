package org.deep.web;

import org.deep.models.Recomendacion;
import org.deep.models.Viaje;
import org.deep.servicios.GestorRecomencaciones;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;
@Controller
@RequestMapping("/viajes")
public class ViajesController {

    @Inject
    GestorRecomencaciones gestorRecomencaciones;


    @RequestMapping(method = RequestMethod.GET, value="/recomendaciones")
    public ModelAndView getRecom(){
        ModelAndView mav = new ModelAndView("recom");
        return mav;
    }
    @RequestMapping(method = RequestMethod.POST, value="/recomendaciones")
    public ModelAndView postRecom(Viaje viaje){
        System.out.println("post");
        System.out.println(viaje);
        ModelAndView mav = null;
        /*if (recomendacion.isValid()){
            gestorRecomencaciones.storeRecomendacion(recomendacion);
            //System.out.println("esee");
            mav = new ModelAndView("recom");


        }else{
            mav = new ModelAndView("recom");
        }
        return mav;*/
        return mav;
    }

}
