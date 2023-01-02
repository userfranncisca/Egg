
import HerenciaInterface4.Circulo;
import HerenciaInterface4.Rectangulo;

/*
 *  plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio
 */


/**
 *
 * @author usuario
 */
public class Herencia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("---RECTANGULO----");
        Rectangulo r= new Rectangulo(5,5);
        System.out.println("Rectangulo  : Base "+ r.getBase()+" Altura "+ r.getAltura());
        System.out.println("Area del Rectangulo:  "+r.area());
        System.out.println("Perimetro del Rectangulo:  "+r.perimetro());
        System.out.println("----CIRCULO----");
        Circulo c = new Circulo(3);
        System.out.println("Ingrese un número");
        System.out.println("Circulo  creado: Radio"+c.getRadio());
        System.out.println("Diametro del Circulo:  "+c.getDiametro());
        System.out.println("Area del circulo: "+c.area());
        System.out.println("Perimetro del circulo: "+c.perimetro());
                
    }
    
}
