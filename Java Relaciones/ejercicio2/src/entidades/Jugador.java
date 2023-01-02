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
public class Jugador {

    private Integer numeroID = 0;
    private String nombre;
    private Boolean mojado;

    public Jugador() {
        numeroID++;
        nombre = "Jugador " + numeroID;
        mojado = false;
    }

    public Jugador(String nombre, Boolean mojado) {
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public Integer getNumeroID() {
        return numeroID;
    }

    public void setNumeroID(Integer numeroID) {
        this.numeroID = numeroID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "numeroID=" + numeroID + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }

    public boolean disparo(Revolveragua j) {
    boolean mojar=j.mojar();
    j.siguienteChorro();
        if (mojar) {
            mojado=true;
        }    
    return mojar;
    }
}
