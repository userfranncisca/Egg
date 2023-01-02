/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2ent;

/**
 *
 * @author usuario
 */
public class guia2ent {
      private double radio;

    public guia2ent() {
    }

    public guia2ent(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "ejerci2ent{" + "radio=" + radio + '}';
    }
       
}
