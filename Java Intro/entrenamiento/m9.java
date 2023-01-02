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
public class m9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer= new Scanner(System.in);
       int opcion;
        System.out.println("Opciones de motores");
        System.out.println("Ingrese un valor entre 1 y 4 para saber que bomba de motor desea");
        opcion= leer.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Si el tipo de motor es 1, La bomba es de Agua");
                break;
            case 2:
                System.out.println("Si el tipo de motor es 1, La bomba es de Gasolina");
                 break;
             case 3:
                System.out.println("Si el tipo de motor es 3, La bomba es de Hormigón");
                 break;
              case 4:
                System.out.println("Si el tipo de motor es 4, La bomba es de Pasta Alimenticia");
                 break; 
              default:
                  System.out.println("No existe un valor validos para tipo de bomba");
                 
                 
    }
    
}
}
