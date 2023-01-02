/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;

import Rectanguloent.Rectanguloent;
import Rectanguloservi.Rectanguloservi;

/**
 *
 * @author usuario
 */
public class Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Rectanguloservi Rec = new Rectanguloservi();
       Rectanguloent Rectangulo = Rec.CargaDatos();
        System.out.println(Rec.Perimetro(Rectangulo));
        System.out.println(Rec.Superficie(Rectangulo));
        Rec.dibujarRectangulo(Rectangulo);
        
    }
    
}
