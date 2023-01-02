/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author usuario
 */
public class Revolveragua {
   private Integer posicionactual;
   private Integer posicionagua;

    public Revolveragua() {
    }

    public Revolveragua(Integer posicionactual, Integer posicionagua) {
        this.posicionactual = posicionactual;
        this.posicionagua = posicionagua;
    }

    public int getPosicionactual() {
        return posicionactual;
    }

    public void setPosicionactual(Integer posicionactual) {
        this.posicionactual = posicionactual;
    }

    public Integer getPosicionagua() {
        return posicionagua;
    }

    public void setPosicionagua(Integer posicionagua) {
        this.posicionagua = posicionagua;
    }

    @Override
    public String toString() {
        return "Revolveragua{" + "posicionactual=" + posicionactual + ", posicionagua=" + posicionagua + '}';
    }
    public void llenarRevolver(){
        posicionactual=(int)(Math.random()*6)+1;
        posicionagua= (int) (Math.random()*6)+1;
     }
    public boolean mojar(){
     return(posicionactual== posicionagua);
     
    }
    public void siguienteChorro(){
        if (posicionactual==6) {
            posicionactual=1;
        }else{
            posicionactual++;
        }
    }
    
   
}

