/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;


import alumnos.alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class servicio {
    Scanner leer= new Scanner(System.in).useDelimiter("\n");
     
    public void crearAlumno(){
        String op= "";
        
    do {
    alumno Alumno= new alumno();
      ArrayList<Integer> aux= new ArrayList<>();
        System.out.println("Ingrese el nombre del Alumno");
        Alumno.setNombre(leer.next());
        for (int i=0; i<3; i++) {
            System.out.println("Ingrese una nota");
            aux.add(leer.nextInt()); 
        }
         
         System.out.println("Quiere sumar otra nota S o N?");
         op=leer.next();
            
        } while (op.equalsIgnoreCase("S"));
    
    } 
    public void notaFinal(){
        alumno Alumno= null;
        System.out.println("Ingrese el nombre del Alumno");
       
            
        
    }
    
    
    
 

            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
  
            
  }


















