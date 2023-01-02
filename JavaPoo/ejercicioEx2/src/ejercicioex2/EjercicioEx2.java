/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioex2;

import punto.punto;
import puntose.puntose;

/**
 *
 * @author usuario
 */
public class EjercicioEx2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        puntose svc = new puntose();
        punto ent = svc.Cargardatos();
        
        svc.distanciaPunto(ent);
        
    }
    
}
