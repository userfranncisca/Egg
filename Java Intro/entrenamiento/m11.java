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
public class m11 {

    /**
     Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       int num, suma, contador; 
       suma=0;
       contador=0;
       
        do {
          System.out.println("Ingrese 20 números");
          num= leer.nextInt();  
          contador= contador+1;
           
            if (num>0) {
             suma=suma+num;
             
            }else{
                if (num==0) {
                    System.out.println("El número ingresado es igual cero");
                     break;  
                }}
           
            
        } while (num!=0 && contador!=20 );
        System.out.println("La suma de todos los número es: "+suma);
        
       
       
       
       
        
    }
    
}
