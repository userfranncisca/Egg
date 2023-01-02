/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrenamiento;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class m15 {

    /**
     * Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
       String[]Equipo= new String[8];
        String palabra;
        
       for (int i = 0; i <7; i++) {
           System.out.println("Ingrese nombre del participante");
           palabra= leer.nextLine();
           Equipo[i]= palabra;
          
           
        }
           
           
         for (int i = 0; i <7; i++) {
          
             System.out.print("["+Equipo[i]+"]");
              System.out.println(" ");
}
    }
}

