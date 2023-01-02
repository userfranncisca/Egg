/*
 Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.

Clase Date
 */
package array;

import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double []a= new double[50];
        double []b= new double [20];
        double c;
        
        for (int i = 0; i < 50; i++) {
            a[i]=Math.random()*10;
            
        }
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Arreglo ordenado");
        System.out.println(Arrays.toString(a));
        System.out.println("Arreglo b");
        
        
        for (int i = 0; i < 20; i++) {
            c=a[i];
            Arrays.fill(b,i,20, c);   
        }
        for (int i = 10; i < 20; i++) {
            Arrays.fill(b, i, 20, 0.5);
        }
        System.out.println(Arrays.toString(b));
    }
      
}
