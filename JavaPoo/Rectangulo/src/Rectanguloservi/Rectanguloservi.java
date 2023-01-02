/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectanguloservi;

import Rectanguloent.Rectanguloent;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Rectanguloservi {
    Scanner leer = new Scanner(System.in);
    public Rectanguloent CargaDatos(){
      Rectanguloent Rectangulo = new Rectanguloent();
        System.out.println("Ingrese la altura del Rectangulo");
        Rectangulo.setAltura(leer.nextDouble());
        System.out.println("Ingrese la base del Rectangulo");
        Rectangulo.setBase(leer.nextDouble());
        
        return Rectangulo;
    }

 public double Superficie( Rectanguloent supe){
     return supe.getAltura()*supe.getBase();
 }
 public double Perimetro(Rectanguloent peri){
     return ((peri.getBase() + peri.getAltura())*2);
 }      
    
 
 public void dibujarRectangulo(Rectanguloent Rectangulo){
     for (int i = 0; i < Rectangulo.getAltura(); i++) {
            for (int j = 0; j < Rectangulo.getBase(); j++) {
                if (i == 0 || i == (Rectangulo.getAltura()- 1) || j == 0 || j == (Rectangulo.getBase()- 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
     
     }
         
         
     }
 }

     
  
     
     
 
}
