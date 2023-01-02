/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioex3;

import raices.raices;
import raicesrv.raicesrv;

/**
 *
 * @author usuario
 */
public class EjercicioEx3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       raicesrv sv = new raicesrv();
       raices r = sv.CargarDatos();
       
        System.out.println(sv.getDiscriminante(r));
        System.out.println(sv.tieneRaiz(r));
        System.out.println(sv.tieneraices(r));
        sv.obtenerRaiz(r);
       sv.obtenerRaiz(r);
        sv.calcular(r);
               
       
    }
    
}
