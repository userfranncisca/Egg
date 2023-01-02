/*
 * 
 */
package raices;

/**
 *
 * @author usuario
 */
public class raices {
   private double a,b,c, discriminante; 

    public raices() {
    }

    public raices(double a, double b, double c, double discriminante) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.discriminante = discriminante;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminante() {
        return discriminante;
    }

    public void setDiscriminante(double discriminante) {
        this.discriminante = discriminante;
    }
 
}
