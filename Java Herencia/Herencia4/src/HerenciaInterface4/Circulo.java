/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaInterface4;

/**
 *
 * @author usuario
 */
public class Circulo implements calculosFormas {

    private int Radio;
    private int diametro;

 
    public Circulo(int Radio){ 
        this.Radio = Radio;
        this.diametro = 2*Radio;
    }

    public Circulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getRadio() {
        return Radio;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setRadio(int Radio) {
        this.Radio = Radio;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    @Override
    public double area() {
        return PI*Math.pow(Radio, 2);
    }

    @Override
    public double perimetro() {
        return PI*diametro;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
