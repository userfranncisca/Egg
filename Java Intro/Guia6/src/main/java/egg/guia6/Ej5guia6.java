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
public class Ej5guia6 {

    public static void main(String[] args) {
        int numero;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero = leer.nextInt();
        System.out.println("Doble: "+(numero*2)+" Triple: "+(numero*3)+" Raiz cuadrada: "+Math.sqrt(numero));
        
    }
    
}
