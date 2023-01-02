/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecha;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Fecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
     int dia,mes,anio;
        System.out.println("Ingrese el día");
        dia=leer.nextInt();
        System.out.println("Ingresar el mes");
        mes=leer.nextInt();
        System.out.println("Ingresar el año");
        anio=leer.nextInt();
        
        
        Date fechaact = new Date();
        Date fecha = new Date(anio-1900,mes-1,dia);
        
         System.out.println("La diferencia de año es "+(fechaact.getDate()-fecha.getDate()));
        
    }
    
}
