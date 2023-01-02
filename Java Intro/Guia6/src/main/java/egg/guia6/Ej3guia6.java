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
public class Ej3guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palabra;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una frase o palabra");
        palabra = leer.next();
        palabra = palabra.toUpperCase();
        System.out.println("En mayusculas: "+palabra);
        palabra = palabra.toLowerCase();
        System.out.println("En minusculas: "+palabra);
        
    }
    
}
