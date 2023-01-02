/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;

/**
 *  this.cartas.add(new Cartas(j, NewEnumPalos.BASTOS));
                this.cartas.add(new Cartas(j, NewEnumPalos.ESPADAS));
                this.cartas.add(new Cartas(j, NewEnumPalos.ORO));
                this.cartas.add(new Cartas(j, NewEnumPalos.COPA));
 * @author usuario
 */
public class Baraja {
    
    private ArrayList<Cartas> cartas;

    public Baraja() {

        this.cartas = new ArrayList<>();

        for (int j = 1; j < 13; j++) {
            if (j != 8 && j != 9) {
                this.cartas.add(new Cartas(j, NewEnumPalos.BASTOS));
                this.cartas.add(new Cartas(j, NewEnumPalos.ESPADAS));
                this.cartas.add(new Cartas(j, NewEnumPalos.ORO));
                this.cartas.add(new Cartas(j, NewEnumPalos.COPA));

            }
        }
    }
    public ArrayList<Cartas>getCartas(){
        return cartas;
    }
    public void setCartas(ArrayList<Cartas>cartas){
        this.cartas= cartas;
    }

    @Override
    public String toString() {
        return "Baraja["+"cartas="+cartas+'}'; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

