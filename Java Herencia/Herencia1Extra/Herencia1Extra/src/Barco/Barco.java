/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barco;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Barco {
    protected int Matricula;
    protected int Eslora;
    protected int Afabricacion;

    public Barco() {
    }

    public Barco(int Matricula, int Eslora, int Afabricacion) {
        this.Matricula = Matricula;
        this.Eslora = Eslora;
        this.Afabricacion = Afabricacion;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    public int getEslora() {
        return Eslora;
    }

    public void setEslora(int Eslora) {
        this.Eslora = Eslora;
    }

    public int getAfabricacion() {
        return Afabricacion;
    }

    public void setAfabricacion(int Afabricacion) {
        this.Afabricacion = Afabricacion;
    }
    
    
    public void crearBarco(){
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
     Barco b = new Barco(1520, 30, 2018);

    }
    
    
    
    
    
    
}
