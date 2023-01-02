/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pelicula;

import java.util.Comparator;

/**
 *
 * @author usuario
 */
public class pelicula {

    private String titulo;
    private String director;
    private int duracion;

    public pelicula() {
    }

    public pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }

    public static Comparator<pelicula> compararDuracion = new Comparator<pelicula>() {
        //compara los atributos de la clase para ordenarlos
        @Override
        public int compare(pelicula p1, pelicula p2) {
            return Integer.compare(p1.getDuracion(), p2.getDuracion());

        }
    };
    public static Comparator<pelicula> compararTitulo = new Comparator<pelicula>() {
        @Override
        public int compare(pelicula p1, pelicula p2) {
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
    };
    public static Comparator<pelicula> compararDirector = new Comparator<pelicula>() {
        @Override
        public int compare(pelicula p1, pelicula p2) {
            return p1.getDirector().compareTo(p2.getDirector());

        }
    };
}
