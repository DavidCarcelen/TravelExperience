package org.deep.web;

import org.deep.models.Fotografia;
import org.deep.models.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioForm {
    private String nombre;
    private String email;
    private String sobreMi;
    private Integer edad;
    private String password;
    public List<Fotografia> fotografias = new ArrayList<>();

    //setters y getters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSobreMi() {
        return sobreMi;
    }

    public void setSobreMi(String sobreMi) {
        this.sobreMi = sobreMi;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //toString

    @Override
    public String toString() {
        return "UsuarioForm{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", sobreMi='" + sobreMi + '\'' +
                ", edad=" + edad +
                ", password='" + password + '\'' +
                ", fotografias=" + fotografias +
                '}';
    }

    //Metodo para validar el usuario
    public boolean validate(){
        if(nombre != null && email != null && email.indexOf("@") > 0 && sobreMi != null && edad != null && edad > 0 && password != null && password.length() > 5){
            return true;
        }else{
            return false;
        }
    }

    //Metodo para cambiar el formUsuario en Usuario
    public Usuario toUsuario() {
        if(this.validate()){
            return new Usuario(this.nombre, this.email, this.sobreMi, this.edad.intValue(), this.password);
        }else{
            return null;
        }
    }
}
