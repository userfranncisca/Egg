/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.guia6;

//Crear un programa que dado un numero determine si es par o impar.

import java.util.Scanner;

public class Ej6guia6 {

    public static void main(String[] args) {
    int num;
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese un numero para determinar si es par o impar");
    num = leer.nextInt();
    if((num%2)==0){
        System.out.println("El numero "+num+" es par");
    }
    else{
        System.out.println("El numero "+num+" es impar");
    }
    }
    
}
