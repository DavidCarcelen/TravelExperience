package org.deep.web;

import org.deep.models.Fotografia;
import org.deep.servicios.GestorFotografiasInf;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;

@Controller
@RequestMapping("/fotos")
public class FotoController {


    @Inject
    private GestorFotografiasInf gestorFotografias;

    @RequestMapping(value = "/crear_foto", method = RequestMethod.GET)
    public ModelAndView mostrar_crear_foto(){
        ModelAndView mav = new ModelAndView("fotos/crear_foto");
        return mav;
    }

    @RequestMapping(value = "/crear_foto", method = RequestMethod.POST)
    public ModelAndView recibir_crear_foto(Fotografia foto){
        ModelAndView mav = null;
        if(foto.isValid()){
            //Almacenar
            gestorFotografias.storePhoto(foto);
            mav = new ModelAndView("redirect:./lista");
        }else{
            mav = new ModelAndView("fotos/crear_foto");
            mav.addObject("error", "Completa los campos");
            mav.addObject("unaFoto", foto);
        }
        return mav;
    }


    @RequestMapping(method = RequestMethod.GET, value = "/lista")
    public ModelAndView get_foto(){
        ModelAndView mav = new ModelAndView("fotos/lista_fotos");
        mav.addObject("mess", "En ModelAndView");
        mav.addObject("listafotos", gestorFotografias.getListaFotos());
//        mav.addObject("foto", gestorFotografias.getPhotoByLocalizacion("Francia"));
        return mav;
    }

}
