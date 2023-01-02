/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.guia6;

//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados

import java.util.Scanner;

//Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
public class ejercicioprueba4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int centigrados,farenheit;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese temperatura en C°");
        centigrados = leer.nextInt();
        farenheit = 32 + (9*centigrados/5);
        System.out.println("Temperatura en F°: "+farenheit);
    }
    
}
