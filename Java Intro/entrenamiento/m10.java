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
public class m10 {

    /**
     Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta.
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int num=0;
       do{
           System.out.println("Ingrese una nota");
           num=leer.nextInt();
          
       }while((num<0)||(num>10));
             System.out.println("Su nota fue valida exitoooo");
    
    }
    
    
}
