
package com.todocodeacademy.login.persistencia;

import com.todocodeacademy.login.logica.Usuario;
import java.util.List;


public class ControladoraPersistencia {
    
    UsuarioJpaController usuJpa = new UsuarioJpaController();

    public List<Usuario> traerUsuarios() {
        return usuJpa.findUsuarioEntities();
        //SELECT * FROM USUARIOS
    }
    
}
