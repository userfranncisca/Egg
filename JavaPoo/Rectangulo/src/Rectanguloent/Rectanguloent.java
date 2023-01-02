/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectanguloent;

/**
 *
 * @author usuario
 */
public class Rectanguloent {
    private double base;
    private double altura;

    public Rectanguloent() {
    }

    public Rectanguloent(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectanguloent{" + "base=" + base + ", altura=" + altura + '}';
    }

   
    
     
}
