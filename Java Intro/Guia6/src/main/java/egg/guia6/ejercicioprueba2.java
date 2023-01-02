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
public class ejercicioprueba2 {

    //Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
//pantalla.
    public static void main(String[] args) {
     String nombre;
     Scanner leer = new Scanner(System.in);
     System.out.println("Ingrese su nombre");
     nombre = leer.next();
     System.out.println("Su nombre es: "+nombre);
    }
    
}
