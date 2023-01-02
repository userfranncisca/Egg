/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barco;

import java.time.LocalDate;

/**
 *
 * @author usuario
 */
public class Alquiler {
    protected String Nombre;
    protected int DNI;
    protected LocalDate FechaAlquiler;
    protected LocalDate FechadeDevolucion;
    protected int Posiciondelamarre;
    protected Barco Barco;

    public Alquiler() {
    }

    public Alquiler(String Nombre, int DNI, LocalDate FechaAlquiler, LocalDate FechadeDevolucion, int Posiciondelamarre, Barco Barco) {
        this.Nombre = Nombre;
        this.DNI = DNI;
        this.FechaAlquiler = FechaAlquiler;
        this.FechadeDevolucion = FechadeDevolucion;
        this.Posiciondelamarre = Posiciondelamarre;
        this.Barco = Barco;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public LocalDate getFechaAlquiler() {
        return FechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate FechaAlquiler) {
        this.FechaAlquiler = FechaAlquiler;
    }

    public LocalDate getFechadeDevolucion() {
        return FechadeDevolucion;
    }

    public void setFechadeDevolucion(LocalDate FechadeDevolucion) {
        this.FechadeDevolucion = FechadeDevolucion;
    }

    public int getPosiciondelamarre() {
        return Posiciondelamarre;
    }

    public void setPosiciondelamarre(int Posiciondelamarre) {
        this.Posiciondelamarre = Posiciondelamarre;
    }

    public Barco getBarco() {
        return Barco;
    }

    public void setBarco(Barco Barco) {
        this.Barco = Barco;
    }

  
    public void calcularAlquiler() {
         Alquiler al= new Alquiler();
         

       
       
       
   


    }
}






   
   
   
    
    

