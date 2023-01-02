/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia1;

import Animal.Animal;
import Animal.Caballo;
import Animal.Gato;
import Animal.Perro;

/**
 *
 * @author usuario
 */
public class Herencia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Animal perro1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
        perro1.alimentarHijas();

        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.alimentarHijas();
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siames");
        gato1.alimentarHijas();
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.alimentarHijas();
    }

}
