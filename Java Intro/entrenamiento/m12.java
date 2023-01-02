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
public class m12 {

    /**
     * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
               
         int contador;
         contador=0;
        do {
            System.out.println("Ingrese 4 números");
             int num = leer.nextInt();
            if (num<0 || num>20) {
                System.out.println("El númerot tiene que estar entre 1y 20 :)");
            }
 
            
            for (int i = 0; i <num; i++) {
            System.out.print("*");
        }
          
            System.out.println(" ");
            contador= contador+1;
        } while (contador<4);
        
       
        
        
        
        
       
       
       
       
       
       
       
    }
    
}
