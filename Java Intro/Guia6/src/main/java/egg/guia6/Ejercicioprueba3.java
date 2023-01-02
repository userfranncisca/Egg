/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.guia6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicioprueba3 {

    //Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
//en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
    public static void main(String[] args) {
    String palabra;
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese una palabra o frase");
    palabra = leer.next();
    palabra = palabra.toUpperCase();
    System.out.println("Mayuscula: "+palabra);
    palabra = palabra.toLowerCase();
    System.out.println("Minuscula :"+palabra);
    }
    
}
