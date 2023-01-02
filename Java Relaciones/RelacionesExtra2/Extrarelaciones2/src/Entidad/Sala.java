/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Sala {
    private String[][] sillas = {
        {"8A ", "8B ", "8C ", "8D ", "8E ", "8F "},
        {"7A ", "7B ", "7C ", "7D ", "7E ", "7F "},
        {"6A ", "6B ", "6C ", "6D ", "6E ", "6F "},
        {"5A ", "5B ", "5C ", "5D ", "5E ", "5F "},
        {"4A ", "4B ", "4C ", "4D ", "4E ", "4F "},
        {"3A ", "3B ", "3C ", "3D ", "3E ", "3F "},
        {"2A ", "2B ", "2C ", "2D ", "2E ", "2F "},
        {"1A ", "1B ", "1C ", "1D ", "1E ", "1F "}
    };
    private ArrayList<Espectador> espectadores;
    private Pelicula peli;

    public Sala(ArrayList<Espectador> espectadores, Pelicula peli) {
        this.espectadores = espectadores;
        this.peli = peli;
    }

    public Sala() {
    }

    public String[][] getSillas() {
        return sillas;
    }

    public void setSillas(String[][] sillas) {
        this.sillas = sillas;
    }

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }
  
}
