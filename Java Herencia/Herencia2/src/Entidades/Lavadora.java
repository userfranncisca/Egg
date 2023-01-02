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
public class Lavadora extends Electrodomesticos {

    protected int carga;

    public Lavadora() {
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, int Precio, String Color, String ConsumoEnergetico, int Peso) {
        super(Precio, Color, ConsumoEnergetico, Peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return super.toString()+"carga"+this.carga;
    }
    @Override
    public void preciofinal() {
        super.preciofinal();
        if (this.carga > 30) {
          this.Precio+=500 ;
        }
    }

    public void  crearLavadora() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Lavadoraaaa");
        System.out.println("Ingrese la carga de la lavadora");
        this.carga = leer.nextInt();
        super.crearElectrodomestico();
        preciofinal();
        System.out.println(this.Precio);
       
       }
     
}
