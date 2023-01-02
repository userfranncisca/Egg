/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenamain;

import cadena.cadena;
import cadenaservicios.cadenaservicios;

public class cadenamain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cadenaservicios cd= new cadenaservicios();
        cadena ct= cd.ingresarfrase(); 
         System.out.println( "La vocal se repite"+cd.contarVocales(ct));
        cd.invertirFrase(ct);
         System.out.println("EL caracter se repite "+cd.vecesRepetidos(ct)); 
        cd.metodoCompara(ct);
         cd.unirFrases(ct);
          cd.reemplazar(ct);
      
        System.out.println(cd.contiene(ct)+"jaja");
        
    }
    
}
