/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.guia6;
//Agüero Daniel
//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados

import java.util.Scanner;

//Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
public class Ej4guia6 {

    public static void main(String[] args) {
        int centigrados,farenheit;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en C°");
        centigrados = leer.nextInt();
        farenheit = 32+(9*centigrados/5);
        System.out.println("La temperatura en F° seria: "+farenheit);
    }
    
}
