/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author usuario
 */
public class Pelicula {
  private String Titulo;
  private int duraciominutos;
  private int edadminima;
  private String director;

    public Pelicula() {
    }

    public Pelicula(String Titulo, int duraciominutos, int edadminima, String director) {
        this.Titulo = Titulo;
        this.duraciominutos = duraciominutos;
        this.edadminima = edadminima;
        this.director = director;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getDuraciominutos() {
        return duraciominutos;
    }

    public void setDuraciominutos(int duraciominutos) {
        this.duraciominutos = duraciominutos;
    }

    public int getEdadminima() {
        return edadminima;
    }

    public void setEdadminima(int edadminima) {
        this.edadminima = edadminima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "Titulo=" + Titulo + ", duraciominutos=" + duraciominutos + ", edadminima=" + edadminima + ", director=" + director + '}';
    }
  
}
