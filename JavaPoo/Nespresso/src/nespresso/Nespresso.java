/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nespresso;

import nespressoentidades.nespressoentidades;
import nespressoservicios.nespressoservicios;

/**
 *
 * @author usuario
 */
public class Nespresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        nespressoservicios cf = new nespressoservicios();
        nespressoentidades ce = cf.Cargardatos();
         System.out.println(cf.toString());
        cf.llenarCafetera(ce);
        cf.mostrarCafetera(ce);
        cf.vaciarCafetera(ce);
        cf.servirTaza(ce);
        
                
       
    }
    
}
