/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Televisor extends Electrodomesticos {

    protected int Resolucion;
    protected boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(int Resolucion, boolean sintonizadorTDT) {
        this.Resolucion = Resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor(double Precio, String Color, String ConsumoEnergetico, int Peso) {
        super(Precio, Color, ConsumoEnergetico, Peso);
    }

    public int getResolucion() {
        return Resolucion;
    }

    public void setResolucion(int Resolucion) {
        this.Resolucion = Resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevisor() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Televisorrrrr");
        super.crearElectrodomestico();
        System.out.println("Ingrese las pulgadas del televisor");
        this.Resolucion = leer.nextInt();
        System.out.println("Tiene TDT? S/N");
        String vd= leer.next();
        if (vd.equalsIgnoreCase("S")) {
            this.sintonizadorTDT=true;
        }else{
            this.sintonizadorTDT=false;
        }
        preciofinal();
    }

    @Override
    public String toString() {
        return super.toString()+"Televisor{" + "Resolucion=" + Resolucion + ", sintonizadorTDT=" + sintonizadorTDT + '}';
    }
    
@Override
    public void preciofinal() {
        super.preciofinal();
        
        
        if (Resolucion > 40 ) {
            this.Precio=  this.Precio*1.3;
        }
        if (sintonizadorTDT) {
            this.Precio+=500;
        }
    }
}
