/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.entidad;


import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author usuario
 */
public class servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Set<entidad> f = new TreeSet<>();
    entidad s;
    public void crearPaises() {
        String op="";
        do {
            
            String nombre;
             s = new entidad();
            System.out.println("Ingrese un pais");
            nombre=leer.next();
            s.setPais(nombre);
            f.add(s);
            System.out.println("Desea añadir otro país S o N");
            op = leer.next();

        } while (op.equalsIgnoreCase("S"));

    }

    public void mostrar() {
        System.out.println("Los paises son ");

        for (entidad s : f) {
            System.out.println(s);
        }

    }

    public void eliminar() {
        System.out.println("Que desea eliminar?");
        String pai=leer.next();
        entidad pp= new entidad();
        pp.setPais(pai);
        for (int i = 0; i < f.size(); i++) {
            if (f.contains(pp)) {
               f.remove(pp);
            }
            
        }
            
        }
     
        
    

}


