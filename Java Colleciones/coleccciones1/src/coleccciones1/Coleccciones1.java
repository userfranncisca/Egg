/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccciones1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
public class Coleccciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArrayList <String>razas= new ArrayList();
      Scanner leer= new Scanner(System.in).useDelimiter("\n");
      String opcion="";
      do { System.out.println("Ingrese una raza de perro");
      razas.add(leer.next());
         System.out.println("Quiere ingresar otra raza de perro(S) o prefiere salir(N)?");
          opcion=leer.next();
      }while(opcion.equalsIgnoreCase("S"));  
      for (String aux: razas){ System.out.println(""+aux);
            
    }
        System.out.println("Ingrese la raza que va a eliminar");
        razas.remove(leer.next());
        
        System.out.println("Lista actualizada ");
        for (String aux: razas)
            System.out.println(aux);
    }
}
    

