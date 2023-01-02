/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ent;

/**
 *
 * @author usuario
 */
public class ent {
   
    private long DNI;
    private String Letra;

    public ent() {
    }

    public ent(long DNI, String Letra) {
        this.DNI = DNI;
        this.Letra = Letra;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getLetra() {
        return Letra;
    }

    public void setLetra(String Letra) {
        this.Letra = Letra;
    }

    @Override
    public String toString() {
        return "ent{" + "DNI=" + DNI + ", Letra=" + Letra + '}';
    }

    
    
   
}
