/*
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package colecciones6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Colecciones6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       HashMap<String,Integer>App= new HashMap<>(); 
     
       
      Scanner leer= new Scanner(System.in).useDelimiter("\n");
      String opcion,producto;
      int precio;
      boolean salir=true;
      
      
        System.out.println("BIENVENIDOS A LA APP :) ");
        System.out.println("----------------------");
        System.out.println();
        do {
            System.out.println("1.Añadir productos");
            System.out.println("2.Mostrar productos");
          System.out.println("3.Eliminar productos");
          System.out.println("4.Modificar productos");
          System.out.println("5.Salir");
            opcion= leer.next(); 
             switch(opcion){
        case "1":
             System.out.println("Ingrese el producto");
             producto=leer.next();
             System.out.println("Ingrese el precio del producto");
             precio=leer.nextInt();
             App.put(producto,precio);
             break;
        case "2":
             System.out.println("Producto más precio");
             for (Map.Entry<String, Integer> entry : App.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                 System.out.println(key+" $"+value+"  ");
            }
             break;
        case "3":
         System.out.println("Para eliminar un producto");
           String var=leer.next();
            if (App.containsKey(var)) {
                App.remove(var);
            }else{
                System.out.println("El producto no ha sido encontrado");
            }
           break;
        case "4":
             System.out.println("Que producto desea modificar");
             String pro = leer.next();
             if (App.containsKey(pro)){
               System.out.println("Qué precio desea poner?");
                App.replace(pro,leer.nextInt() );
             }
             break;
             
        case"5":
            System.out.println("");
            salir=false;
            break;
        default:
                System.out.println("La opción que ingreso no es viable");
                
                
             }        
        } while (salir);
       
        
       
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
         
      }
    
          
      
}
