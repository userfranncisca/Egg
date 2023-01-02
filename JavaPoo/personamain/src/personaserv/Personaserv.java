/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaserv;

import java.util.Scanner;
import persona.persona;

/**
 *
 * @author usuario
 */
public class Personaserv {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public persona Cargadedatos(){
      persona p= new  persona();
        System.out.println("Ingrese su nombre");
        p.setNombre(leer.next());
        System.out.println("Ingrese su edad");
        p.setEdad(leer.nextInt());
        System.out.println("Ingrese su altura en mts");
        p.setAltura(leer.nextInt());
        System.out.println("Ingrese su sexo F,M,O");    
        p.setSexo(leer.next());
        System.out.println("Ingrese su peso"); 
        p.setPeso(leer.nextInt());
        return p;
    }
   
    public int calcularIMC(persona p){
        int valor;
      double imc =(p.getPeso()/Math.pow(p.getAltura(), 2));
        if (imc<20) {
            valor=-1;
            System.out.println("Usted esta bajo el peso ideal");
        }else if (imc<=25){
            valor=0;
            System.out.println("USted esta en el peso ideal");
        }else{
            valor=1;
            System.out.println("Usted esta sobrepeso");
        }
        return valor;
        
        }
     public void esMayordeEdad(persona p){
         System.out.println(" ");
        
         if (p.getEdad()>18) {
             System.out.println("Usted es mayor de edad");
         }else if (p.getEdad()<18){
             System.out.println("Usted es menor de edad"); 
           
            
         }
        
         
     }
        
    }   
    
            

    

    
    

