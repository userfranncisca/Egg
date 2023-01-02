/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2service;

import guia2ent.guia2ent;
import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class guia2servi {

    public guia2ent CrearCircunferencia() {
        Scanner leer = new Scanner(System.in);

        guia2ent valorRadio = new guia2ent();
        System.out.println("Ingrese el radio");
        valorRadio.setRadio(leer.nextDouble());

        return valorRadio;

    }
    public double Area(guia2ent valorRadio){
     double area = PI*(valorRadio.getRadio()*valorRadio.getRadio());
     return area;
    }
     public double perimetro(guia2ent valorRadio){
     double perimetro= 2*PI*valorRadio.getRadio();
     return perimetro;
     }
}
     

