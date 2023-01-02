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
public class Electrodomesticos {

    protected double Precio = 1000;
    protected String Color;
    protected String ConsumoEnergetico;
    protected int Peso;

    public Electrodomesticos() {
    }

    public Electrodomesticos(double Precio, String Color,String ConsumoEnergetico, int Peso) {
        this.Precio = Precio;
        this.Color = Color;
        this.ConsumoEnergetico = ConsumoEnergetico;
        this.Peso = Peso;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getConsumoEnergetico() {
        return ConsumoEnergetico;
    }

    public void setConsumoEnergetico(String ConsumoEnergetico) {
        this.ConsumoEnergetico = ConsumoEnergetico;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "Precio=" + Precio + ", Color=" + Color + ", consumoEnergetico=" + ConsumoEnergetico + ", peso=" + Peso + '}';
    }

    private String comprobarColor(String color) {
        if (!color.equalsIgnoreCase("blanco") || !color.equalsIgnoreCase("negro")
                || !color.equalsIgnoreCase("rojo") || !color.equalsIgnoreCase("azul") || !color.equalsIgnoreCase("gris")) {
            return "blanco";
        } else {
            return color;
        }
    }

    private String comprobarConsumoEnergetico(String letra) {
        if (!letra.equalsIgnoreCase("A") || !letra.equalsIgnoreCase("B")
                || !letra.equalsIgnoreCase("C") || !letra.equalsIgnoreCase("D")
                || !letra.equalsIgnoreCase("E") || !letra.equalsIgnoreCase("F")) {
            return "F";
        } else {
            return letra;

        }
    }

     public  void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el color del producto");
        String color = leer.nextLine();
        this.Color = comprobarColor(color);
        System.out.println("Ingrese el consumo energetico:A,B,C,D,E,F");
        String consumo= leer.nextLine();
        this.ConsumoEnergetico = comprobarConsumoEnergetico(consumo);
        System.out.println("Ingrese el peso del producto");
        int peso= leer.nextInt();
        this.Peso=peso;
        
         
    }

    public  void preciofinal() {
       char precio = 0;
        if (this.Precio < 20) {
            precio += 100;
        } else if (this.Precio < 50) {
            precio += 500;
        } else if (this.Precio < 80) {
            precio += 800;
        } else if (this.Precio > 80) {
            precio += 1000;        }
        switch (this.ConsumoEnergetico) {
            case "A":
                precio += 1000;
                ;
                break;
            case "B":
                precio += 800;
                ;
                break;
            case "C":
                precio += 600;
                ;
                break;
            case "D":
                precio += 500;
                ;
                break;
            case "E":
                precio += 300;
                ;
                break;
            case "F":
                precio += 100;
                ;
                break;
        }
        this.Precio += precio;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
