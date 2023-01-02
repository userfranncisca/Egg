/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntose;

import java.util.Scanner;
import punto.punto;

/**
 * Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos,
 * sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un
 * objeto puntos usando un método crearPuntos() que le pide al usuario los dos
 * números y los ingresa en los atributos del objeto. Después, a través de otro
 * método calcular y devolver la distancia que existe entre los dos puntos que
 * existen en la clase Puntos. Para conocer como calcular la distancia entre dos
 * puntos consulte el siguiente link: √(x2-x1)^2 +(y2-y1)^2
 *
 *
 */
public class puntose {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public punto Cargardatos() {
        punto p = new punto();
        System.out.println("Coordenada X del primer punto");
        p.setX1(leer.nextInt());
        System.out.println("Coordenada Y del primer punto");
        p.setY1(leer.nextInt());
        System.out.println("Coordenada X del segundo punto");
        p.setX2(leer.nextInt());
        System.out.println("Coordenada Y del segundo punto");
        p.setY2(leer.nextInt());

        return p;
    }
   public void distanciaPunto(punto p){
       int x1=p.getX1(),x2=p.getX2(),y1=p.getY1(),y2=p.getY2();
       double formula=(double)Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
       System.out.println("La distancia entre el punto 1 y punto 2 es "+formula);
   }
}
