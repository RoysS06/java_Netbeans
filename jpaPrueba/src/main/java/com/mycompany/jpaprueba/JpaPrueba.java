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
        
        // CREAMOS LISTA DE MATERIAS Y LAS AGREGAMOS
        LinkedList<Materia> listaMaterias = new LinkedList <Materia>();
        
        //CREACIÓN DE CARRERA
        Carrera carre = new Carrera(25, "Sofware", listaMaterias);
        
        //GUARDAR CARRERA EN BD
        control.crearCarrera(carre);
        
        
        //CREACIÓN DE MATERIA
        Materia mate1 = new Materia(58, "Programación I","Cutrimestral", carre);
        Materia mate2 = new Materia(59, "Programación II","Cutrimestral", carre);
        Materia mate3 = new Materia(60, "Programación avanzada","Anual", carre);

        
        //GUARDAR EN LA BASE DE DATOS
        control.crearMateria(mate1);
        control.crearMateria(mate2);
        control.crearMateria(mate3);

        
        //AGREGAMOS LISTA DE MATERIAS
        listaMaterias.add(mate1);
        listaMaterias.add(mate2);
        listaMaterias.add(mate3);

        
        
        carre.setListaMaterias(listaMaterias);
        control.editarCarrera(carre);
        
       
        
        //CREACIÓN ALUMNO(CARRERA)
         Alumno alu = new Alumno(23, "Ian", "Rodriguez", new Date(), carre);

         //GUARDAMOS EL ALUMNO EN EL BD
         control.crearAlumno(alu);
         
         //VEMOS EL RESULTADO
         System.out.println("--------------------");
         System.out.println("------DATOS DEL ALUMNO");
         Alumno al = control.traerAlumno(23);
         System.out.println("El alumno es: " + al.getNombre() + " " + al.getApellido());
         System.out.println("Cursa la carrera de: " + al.getCarre().getNombre());
    }
}
