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
public class Ej1gui6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int suma;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros a sumar");
        numero1 = leer.nextInt();
        numero2 = leer.nextInt();
        suma = (numero1 + numero2);
        System.out.println("El resultado de "+numero1+" + "+numero2+" = "+suma);
    }
    
}
