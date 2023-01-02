/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import Pelicula.pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
  
    ArrayList<pelicula> Peliculas = new ArrayList();
    //nombre de la clase de  la entidad

    public void crearPelicula() {
        String opcion = "";
        do {
              pelicula p1 = new pelicula();
            System.out.println("Ingrese titulo de la pelicula");
            p1.setTitulo(leer.next());
            System.out.println("Ingrese el director de la pelicula");
            p1.setDirector(leer.next());
            System.out.println("Duracion de la pelicula");
            p1.setDuracion(leer.nextInt());
            Peliculas.add(p1);

            System.out.println("Desea añadir otra pelicula S o N");
            opcion = leer.next();
        } while (opcion.equalsIgnoreCase("S"));
    }

    public void mostrarPeliculas() {
        for (pelicula aux : Peliculas) {
            System.out.println(aux);
        }

    }

    public void mostarHora() {
        System.out.println("Peliculas mayores a una hora ");
        for (pelicula aux : Peliculas) {
            if (aux.getDuracion() >= 60) {
                System.out.println(aux);
            }
        }

    }

    public void mostrarMayor() {
        System.out.println("Peliculas de menor duración a mayor");
        Peliculas.sort(pelicula.compararDuracion);
        for (pelicula aux : Peliculas) {
            System.out.println(aux);
        }
    }

    public void mostrarMenor() {
        System.out.println("Peliculas de mayor a menor duración");
        Collections.reverse(Peliculas);
        for (pelicula aux : Peliculas) {
            System.out.println(aux);
        }

    }

    public void porTitulo() {
        System.out.println("Peliculas ordenadas por titulo");
        Peliculas.sort(pelicula.compararTitulo);
        for (pelicula aux : Peliculas) {
            System.out.println(aux);
        }
    }

    public void porDirector() {
        System.out.println("Peliculas ordenadas por Director");
        Peliculas.sort(pelicula.compararDirector);
        for (pelicula aux : Peliculas) {
            System.out.println(aux);
        }
    }
    public void menu(){
        mostrarPeliculas();
        mostarHora();
        mostrarMayor();
        mostrarMenor();
        porTitulo();
        porDirector();
        
    }

}


