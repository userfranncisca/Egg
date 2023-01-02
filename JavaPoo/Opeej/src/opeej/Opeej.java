/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opeej;

import operaent.operaent;
import operaservi.operaservi;

/**
 *
 * @author usuario
 */
public class Opeej {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        operaservi leer = new operaservi();
        operaent Operaciones= leer.CrearOperacion();
        System.out.println("suma"+leer.sumar(Operaciones)); 
        System.out.println("restar"+leer.restar(Operaciones));
        if (leer.multiplicar(Operaciones)==0) {
            System.out.println("Error en la Multiplicación por 0");
        }else System.out.println("La multiplicacion es "+leer.multiplicar(Operaciones));
        
        if(leer.dividir(Operaciones)==-1){
            System.out.println("ERROR estas dividiendo por 0");
        }else System.out.println("La division es "+leer.dividir(Operaciones));
            
     
    }
    
}
