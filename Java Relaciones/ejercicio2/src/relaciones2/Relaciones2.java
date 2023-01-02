/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones2;

import entidades.Jugador;
import entidades.Revolveragua;
import entidades.juego;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Relaciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        System.out.println("Cual es la cantidad de jugadores?");
        int cantidad= leer.nextInt();
        
        ArrayList<Jugador>lista= new ArrayList();
        for (int i = 0; i < cantidad; i++) {
            Jugador p= new Jugador();
            lista.add(p);
            
        }
        juego j= new juego();
        Revolveragua rv = new Revolveragua();
        rv.llenarRevolver();
        j.llenarjuego(lista, rv);
        j.ronda();
       
    }
    
}
