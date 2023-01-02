package guia1.java;

import java.util.Scanner;

/**
 *
 * @author Eduardo.AM
 */
public class m13 {

    /*
    EJERCICIO 11
    Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
    en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
    reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
    vocales acentuadas) se mantienen sin cambios.
    a e i o u
    @ # $ % *
    Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
    correspondiente. Utilice la estructura “según” para la transformación.
    Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
    La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un texto terminado en un punto: ");
        String frase = leer.nextLine();
        
        String retorno = codificacion(frase);
        System.out.println(retorno);
    }
    
    public static String codificacion (String frase){
        
        int longi = frase.length();
        String cod,textcod;
        textcod = "";
        
        for (int i = 0; i < longi; i++) {
           cod = frase.substring(i,i+1);
            switch(cod.toLowerCase()){
                case "a":
                    cod = "@";
                    break;
                case "e":
                    cod = "#";
                    break;
                case "i":
                    cod = "$";
                    break;
                case "o":
                    cod = "%";
                    break;
                case "u":
                    cod = "*";
                    break;
            }
            textcod = textcod + cod;
        }
        return textcod;
    }
}