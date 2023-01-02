/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;



/**
 *
 * @author usuario
 */
public class entidad implements Comparable<entidad>{
    private String  pais;

    public entidad() {
    }

    public entidad(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "entidad{" + "pais=" + pais + '}';
    }

    @Override
    public int compareTo(entidad t) {
        return this.pais.compareTo(t.getPais());
    };
    
    
    
    
  }
    
    
    
    
    
    
    
    
    

