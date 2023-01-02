/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barco;

/**
 *
 * @author usuario
 */
public class Velero extends Barco{
     protected int NMastiles;

    public Velero() {
    }

    public Velero(int NMastiles) {
        this.NMastiles = NMastiles;
    }

    public Velero(int Matricula, int Eslora, int Afabricacion) {
        super(Matricula, Eslora, Afabricacion);
    }

    public int getNMastiles() {
        return NMastiles;
    }

    public void setNMastiles(int NMastiles) {
        this.NMastiles = NMastiles;
    }

    
    public void velero(){
        Velero v= new Velero(3);
        
    }

   
     
}
