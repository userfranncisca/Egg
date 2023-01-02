/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */

public class juego {
   private Revolveragua lea;
   private  ArrayList <Jugador> jugadores;

    public juego() {
    }

    public juego(Revolveragua lea, ArrayList<Jugador> jugadores) {
        this.lea = lea;
        this.jugadores = jugadores;
    }

    public Revolveragua getLea() {
        return lea;
    }

    public void setLea(Revolveragua lea) {
        this.lea = lea;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
   public void llenarjuego(ArrayList<Jugador>jugadores,Revolveragua lea){
    this.jugadores= jugadores;
    this.lea= lea;
    
   }
public void ronda(){
   Jugador p;
   int cantidad=this.jugadores.size();
   int cont=0;
    System.out.println("Posicion Carga "+lea.getPosicionagua());
    do {
        System.out.println("Posicion Actual "+lea.getPosicionactual());
        p=this.jugadores.get(cont);
        if (p.disparo(lea)) {
            System.out.println(p.getNombre()+"  SE MOJO;)  ");
            break;
            
        }else{
            System.out.println(p.getNombre()+ "  NO SE MOJO   ");
        }
        if (cont==cantidad-1) {
            cont=0;
        }
            cont++;
        
    } while (!p.getMojado());
    
}

}
 

    

