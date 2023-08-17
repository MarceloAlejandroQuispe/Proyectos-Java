package com.todocodeacademy.login.logica;

import com.todocodeacademy.login.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis; // = new ControladoraPersistencia();

    public Controladora() {
        controlPersis = new ControladoraPersistencia();
    }
    
    

    public String validarUsuario(String usuario, String contrasenia) {
        
        String mensaje = "";
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();
        
        for (Usuario usu :listaUsuarios ){
            if(usu.getNombreUsuario().equals(usuario)){
                if(usu.getContrasenia().equals(contrasenia)) {
                   mensaje = "Usuario y Contraseña conrrectos. Bienvenido/a! ";
                   return mensaje;
                }
                else{
                    mensaje = "Contraseña Incorrecta";
                    return mensaje;
                }
            }
            else{
                mensaje = "Usuario no encontrado";
              
            }
        }
        
        return mensaje;
        
    }

    
    
}
