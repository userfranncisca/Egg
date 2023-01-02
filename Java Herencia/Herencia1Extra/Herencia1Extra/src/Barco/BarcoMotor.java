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
public class BarcoMotor extends Barco{
    protected int potenciaCV;

    public BarcoMotor() {
    }

    public BarcoMotor(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    

    public BarcoMotor(int Matricula, int Eslora, int Afabricacion) {
        super(Matricula, Eslora, Afabricacion);
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

     public void crearB(){
         Scanner leer = new Scanner(System.in);
         BarcoMotor BM= new BarcoMotor(20);
         
        
         
     }
}
