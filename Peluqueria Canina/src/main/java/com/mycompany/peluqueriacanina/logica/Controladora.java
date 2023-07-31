package com.mycompany.peluqueriacanina.logica;


import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new  ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color, String observaciones, String alergico, String atenEsp, String Duenio, String celDuenio) {
        
        //Creamos al dueño y asignamos sus valores
        Duenio duenio = new Duenio();
        duenio.setNombre(Duenio);
        duenio.setCelDuenio(celDuenio);
        
        //Creamos la mascota y asignamos sus valores
        Mascota masco = new Mascota ();
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObsevaciones(observaciones);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEsp);
        masco.setUnDuenio(duenio);
        
        controlPersis.guardar(duenio, masco);
    }

    public List<Mascota> traerMascotas() {
        
        return controlPersis.traerMascotas();
        
    }

    public void borrarMascota(int num_cliente) {
        controlPersis.borrarMascota(num_cliente);
    }
    public Mascota traerMascota(int num_cliente) {
        return controlPersis.traerMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco, String nombreMasco, String raza, String color, String observaciones, String alergico, String atenEsp, String Duenio, String celDuenio) {
        
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObsevaciones(observaciones);
        masco.setAtencion_especial(atenEsp);
        masco.setAlergico(alergico);
        
        // Modifico mascota
        controlPersis.modificarMascota(masco);
        
        //Seteo nuevos valores del Dueño
        Duenio dueno = this.buscarDuenio(masco.getUnDuenio().getId_duenio());
        dueno.setCelDuenio(celDuenio);
        dueno.setNombre(Duenio);
        
        // Llamar al modificar Dueño
        this.modificarDuenio(dueno);
    }

    private Duenio buscarDuenio(int id_duenio) {
        return controlPersis.traerDuenio(id_duenio);
    }

    private void modificarDuenio(Duenio dueno) {
        controlPersis.modificarDuenio(dueno);
    }
}
