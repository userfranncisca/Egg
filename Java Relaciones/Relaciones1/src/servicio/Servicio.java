/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Perro;
import entidades.Persona;
import java.util.Scanner;

/**
 **Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a
 * contar de dos clases. Perro, que tendrá como atributos: nombre, raza, edad y
 * tamaño; y la clase Persona con atributos: nombre, apellido, edad, documento y
 * Perro. Ahora deberemos en el main crear dos Personas y dos Perros. Después,
 * vamos a tener que pensar la lógica necesaria para asignarle a cada Persona un
 * Perro y por ultimo, mostrar desde la clase Persona, la información del Perro
 * y de la Persona.
 *
 * @author usuario
 * @author usuario
 */
public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona one = new Persona();

    public void crearPersona() {
        int personas = 1;
        do {
            System.out.println("Ingrese su nombre");
            one.setNombre(leer.next());
            System.out.println("Ingresar su apellido");
            one.setApellido(leer.next());
            System.out.println("Ingrese su edad");
            one.setEdad(leer.nextInt());
            System.out.println("Ingrese su DNI");
            one.setDNI(leer.next());
            System.out.println("Desea adoptar un perrito?S/N");
            String opcion = leer.next();
            if (opcion.equalsIgnoreCase("S")) {
                switch (personas) {
                    case 1:
                        Perro p1 = new Perro("Chiquitin", "Boxer", 5, "Gordo");
                        one.setPerro(p1);
                        System.out.println(p1);
                        break;
                    case 2:
                        Perro p2 = new Perro("Bebe", "Maltes", 1, "Chico");
                        one.setPerro(p2);
                        System.out.println(p2);

                }

            }

            personas++;
        } while (personas == 2);
    }

}
