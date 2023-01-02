/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personamain;

import java.util.Date;
import java.util.Scanner;
import persona.persona;

/**
 *
 * @author usuario
 */
public class personamain {

    /**
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in).useDelimiter("\n");
        int Dia, Mes,Ano;
        persona p = new persona();
        System.out.println("Ingrese su nombre");
        p.setNombre(leer.next());
        System.out.println("Ingrese su apellido");
        p.setApellido(leer.next());
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.println("Dia");
        p.setDia(leer.nextInt());
        System.out.println("Mes");
        p.setMes(leer.nextInt());
        System.out.println("Año");
        p.setAno(leer.nextInt());
        
        Date fecha = new Date(p.getAno()-1900,p.getMes()-1,p.getDia());
        p.setFecha(fecha);
        System.out.println("La  fecha de nacimiento de la persona que ingreso "+p.getFecha());
        System.out.println("La edad de la persona que ingreso es "+calcularEdad(fecha));
        System.out.println("Es menor"+menorQue(p));
      
      
        }
    
    
     public static int calcularEdad (Date  fecha ){
         Date fechaact= new Date();
         int edad= (fechaact.getYear()-fecha.getYear());
       
         return edad;
     }

             
    
    public static boolean menorQue(persona p){
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
         boolean flag=true;
        System.out.println("Ingrese la edad de algun receptor");
        int otraEdad=leer.nextInt();
        if (otraEdad<calcularEdad(p.getFecha()));
           flag=true;
           
     return flag;
    }
        
    public static void mostrarPersona(persona p){
        System.out.println("Nombre"+p.getNombre());  
        System.out.println("Apellido"+p.getApellido());
        System.out.println("Fecha de nacimiento"+p.getFecha());
        
        
    }
    

   
    
}
