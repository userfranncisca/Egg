/*
 *  


• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles
soluciones.
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz. Es
en el caso en que se tenga una única solución posible.
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b
 */
package raicesrv;

import java.util.Scanner;
import raices.raices;

/**
 *
 * @author usuario
 */
public class raicesrv {

    Scanner leer = new Scanner(System.in);

    public raices CargarDatos() {
        raices r = new raices();

        System.out.println("Ingrese número para A");
        r.setA(leer.nextInt());
        System.out.println("Ingrese el número B");
        r.setB(leer.nextInt());
        System.out.println("Ingrese el número de C");
        r.setC(leer.nextInt());

        return r;
    }

    public double getDiscriminante(raices r) {
        double discriminante = (Math.pow(r.getB(), 2) -( 4 * r.getA() * r.getC()));
        r.setDiscriminante(discriminante);
        return r.getDiscriminante();
    }

    public boolean tieneraices(raices r) {
        boolean bandera;
        bandera = r.getDiscriminante() > 0;
        return bandera;
    }

    public boolean tieneRaiz(raices r) {
        boolean bandera;
        bandera = r.getDiscriminante() == 0;
        return bandera;
    }

    public void obtenerRaices(raices r) {
        double raiz, raiz1;
        if (tieneraices(r) == true) {
            raiz = (r.getB() + Math.sqrt(Math.pow(r.getB(), 2) - (4 * r.getA() * r.getC() / (2 * r.getA()))));
            raiz1 = (r.getB() - Math.sqrt(Math.pow(r.getB(), 2) - (4 * r.getA() * r.getC() / (2 * r.getA()))));
            System.out.println("Las dos soluciones posibles son " + raiz + " y " + raiz1);

        } else {
            System.out.println("No se puede aplicar el metodo");
        }
    }

    public void obtenerRaiz(raices r) {
        double raiz;
        if (tieneRaiz(r) == true) {
          raiz = -r.getB() / (2 * r.getA());

        } else {
            System.out.println("Nose se puede aplicar este metodo");
        }
    
    }
    
    public void calcular(raices r){
        if (tieneRaiz(r)) {
            obtenerRaiz(r); 
        }else if (tieneraices(r)){
            obtenerRaices(r);
        }else{
            System.out.println("No tiene solucion");
        }
    }



}
