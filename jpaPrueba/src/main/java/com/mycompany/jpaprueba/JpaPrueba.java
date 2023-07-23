package com.mycompany.jpaprueba;
import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.logica.ControladoraLogica;
import com.mycompany.jpaprueba.logica.Materia;
import java.util.Date;
import java.util.LinkedList;


public class JpaPrueba {
    
    public static void main(String[] args) {
        
        ControladoraLogica control = new ControladoraLogica();
        
        // Creamos la lista de Materias y las agregamos
        LinkedList<Materia> listaMaterias = new LinkedList<Materia>();
        
         //Creacion Carrera con lista de Materias  
        Carrera carre  = new Carrera (21,"Tecnicatura en Programacion", listaMaterias);
        
        // Guardado de Carrera en BD
        control.crearCarrera(carre);
        
        // Creacion de Materias
        Materia mate1 = new Materia(58, "Programacion I", "Cuatrimestral", carre);
        Materia mate2 = new Materia(59, "Programacion II", "Cuatrimestral", carre);
        Materia mate3 = new Materia(60, "Programacion Avanzada", "Anual", carre);
        
        //Guardado de Materias en BD
        control.crearMateria(mate1);
        control.crearMateria(mate2);
        control.crearMateria(mate3);
        
        //Agregar a la lista Materias
        listaMaterias.add(mate1);
        listaMaterias.add(mate2);
        listaMaterias.add(mate3);
        
        carre.setListaMaterias(listaMaterias);
        control.editarCarrera(carre);
                
       
        
        // Creacion de Alumno con carrera
        Alumno al = new Alumno (22, "Valente", "Caldera", new Date(), carre);
        
        // Guardamos el alumno en la BD
        control.crearAlumno(al);
        
        // Vemos el resultado
        System.out.println("---------------------------------------------");
        System.out.println("-----------------DATOS ALUMNO----------------");
        Alumno alu = control.traerAlumno(22);
        System.out.println("Alumno: " + alu.getNombre() + " " + alu.getApellido());
        System.out.println("Curso la carrera de : " + alu.getCarre().getNombre());
       
       // control.eliminarAlumno(30);
        
      /* alu.setApellido("Calderero");
       control.editarAlumno(alu);*/
      
      /*Alumno alu = control.traerAlumno(15);
        System.out.println("---------------BUSQUEDA INDIVIDUAL-----------");
        System.out.println("El alumno es : " + alu.toString());
        
        System.out.println("---------------BUSQUEDA DE TODOS-------------");
        ArrayList<Alumno> listaAlumnos = control.traerListaAlumnos();
        for (Alumno al : listaAlumnos){
            System.out.println("El alumno es : " + al.toString());
        }
        System.out.println("---------------------------------------------");*/
    }
}
