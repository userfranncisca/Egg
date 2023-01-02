/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nespressoentidades;

/**
 *
 * @author usuario
 */
public class nespressoentidades {
    private int capacidadmax;
    private int capacidadactual;

    public nespressoentidades() {
    }

    public nespressoentidades(int capacidadmax, int capacidadactual) {
        this.capacidadmax = capacidadmax;
        this.capacidadactual = capacidadactual;
    }

    public int getCapacidadmax() {
        return capacidadmax;
    }

    public void setCapacidadmax(int capacidadmax) {
        this.capacidadmax = capacidadmax;
    }

    public int getCapacidadactual() {
        return capacidadactual;
    }

    public void setCapacidadactual(int capacidadactual) {
        this.capacidadactual = capacidadactual;
    }

    @Override
    public String toString() {
        return "nespressoentidades{" + "capacidadmax=" + capacidadmax + ", capacidadactual=" + capacidadactual + '}';
    }
    
             
}
