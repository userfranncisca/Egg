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
public class m14 {

    /**Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números para saber si son multiplos");
        int num1, num2;
        num1= leer.nextInt();
        num2= leer.nextInt();
         Multiplos(num1,num2);
    }

    public static void Multiplos(int num1, int num2) {
       
  if (num1%num2==0) {
   System.out.println("El número 1 es multiplo del número 2");
}
   else{
 System.out.println("el numero no es multiplo;(");
}
}

        
        
        
    
    
}
