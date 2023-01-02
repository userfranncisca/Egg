/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nespressoservicios;

import java.util.Scanner;
import nespressoentidades.nespressoentidades;

/**
 *
 * @author usuario
 */
public class nespressoservicios {
    Scanner leer= new Scanner(System.in);
    public nespressoentidades Cargardatos(){
       nespressoentidades ness = new nespressoentidades() ;
       System.out.println("Ingrese la cantidad máxima del nespresso");  
        ness.setCapacidadmax(leer.nextInt());
        System.out.println("Ingrese la capacidad Actual");
        ness.setCapacidadactual(leer.nextInt());
        return ness; 
    }
    public void llenarCafetera(nespressoentidades ness){
        ness.setCapacidadactual(ness.getCapacidadmax());
        }
         public void servirTaza(nespressoentidades ness){
             System.out.println("Ingrese el tamaño de la taza");
             int taza = leer.nextInt();
             if (taza < ness.getCapacidadactual()) {
                 System.out.println("La taza se a llenado correctamente");
                 ness.setCapacidadactual(ness.getCapacidadactual()- taza); 
         }else{
                 System.out.println("Se ha llenado solo: "+ ness.getCapacidadactual()+"ML");
             }
         }
         
    public int vaciarCafetera(nespressoentidades ness){
        ness.setCapacidadactual(0);
       return ness.getCapacidadactual();   
    }
    public void agregarCafe(nespressoentidades ness){
        System.out.println("Ingrese la cantidad que desea añadir");
        int cafe= leer.nextInt();
        if (cafe+ness.getCapacidadactual()<= ness.getCapacidadmax()) {
            System.out.println("Se ha agregado el café correctamente");
            ness.setCapacidadactual(ness.getCapacidadactual()+cafe);
        }else{
            System.out.println("El café ");
        }
    
    }
    public void mostrarCafetera(nespressoentidades ness){
        System.out.println(ness.getCapacidadactual());
        System.out.println(ness.getCapacidadmax());
    }
}

 
        
 
               
  
    
            

