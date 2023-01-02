/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicamain;

import matematica.matematica;
import matematicaservicios.matematicaservicios;

/**
 *
 * @author usuario
 */
public class MatematicaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        matematicaservicios serv= new matematicaservicios();
        matematica mat= serv.Cargardatos();
        System.out.println("EL numero mayor es "+serv.devolverMayor(mat));
        System.out.println("La potencia del mayor elevado al menor es "+serv.calcularPotencia(mat));
        System.out.println("La raíz cuadrada del numero menor es "+serv.calcularRaiz(mat));
    }
    
}
