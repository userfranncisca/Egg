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
public class m8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
       
        System.out.println("Ingrese un número");
        int num1= leer.nextInt();
        System.out.println("Ingrese un segundo número");
        int num2= leer.nextInt();
        
        if (num1>25 || num2>25) {
            System.out.println("El numero que ingreso es mayor a 25");
        }else{
            System.out.println("El numero que ingreso es menor a 25");
        }
    }
    
}
