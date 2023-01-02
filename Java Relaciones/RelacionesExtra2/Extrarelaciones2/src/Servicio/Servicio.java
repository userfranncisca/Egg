/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cine;
import Entidad.Espectador;
import Entidad.Pelicula;
import Entidad.Sala;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Servicio {
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList <Pelicula>peliculas= new ArrayList();
    Cine cuevana = new Cine();
    ArrayList <Espectador>espectador= new ArrayList();
    Sala sala = new Sala();
    public void listadePeli(){
        Pelicula p1 = new Pelicula("El Señor de los Anillos: La comunidad del Anillo", 178, 16, "Peter Jackson");
        Pelicula p2 = new Pelicula("El Señor de los Anillos: Las Dos Torres", 179, 13, "Peter Jackson");
        Pelicula p3 = new Pelicula("El Señor de los Anillos: El Retorno del rey", 200, 13, "Peter Jackson");
        Pelicula p4 = new Pelicula("El Hobbit: Un Viaje Inesperado ", 182, 13, "Peter Jackson");
        Pelicula p5 = new Pelicula("El Hobbit: La desolacion de Smaug", 186, 16, "Peter Jackson");
        Pelicula p6 = new Pelicula("El Hobbit: La Batalla de los Cinco Ejercitos", 164, 17, "Peter Jackson");
        peliculas.add(p1);
        peliculas.add(p2);
        peliculas.add(p3);
        peliculas.add(p4);
        peliculas.add(p5);
        peliculas.add(p6);

    }
   
    
    public void seleccionPeli(){
        Pelicula aux;
        int i=1;
        System.out.println("Lista de Peliculas");
        for (Pelicula pelicula : peliculas) {
            System.out.println("N° "+i+" "+pelicula.getTitulo());
            i++;
            
        }
        System.out.println("Seleccione una Pelicula");
        int op=leer.nextInt();
       switch(op){
           case 1:
               aux=peliculas.get(0);
                cuevana.setPeli(aux);
                break;
            case 2:
               aux=peliculas.get(1);
                cuevana.setPeli(aux);
                break;   
            case 3:
               aux=peliculas.get(2);
                cuevana.setPeli(aux);
                break;  
            case 4:
               aux=peliculas.get(3);
                cuevana.setPeli(aux);
                break;    
             case 5:
               aux=peliculas.get(4);
                cuevana.setPeli(aux);
                break;    
             case 6:
               aux=peliculas.get(5);
                cuevana.setPeli(aux);
                break;    
       }

    } 
        public void crearEspectadores(){
           String opcion=" ";
           
            do {
            Espectador aux= new Espectador();
            System.out.println("Ingrese su nombre"); 
            aux.setNombre(leer.next());
            System.out.println("Ingrese su edad");
            aux.setEdad(leer.nextInt());
            System.out.println("Ingrese dinero disponible");
            aux.setDinerodisponible(leer.nextInt());
             
                if (aux.getEdad()>cuevana.getPeli().getEdadminima()&& aux.getDinerodisponible()>cuevana.getPrecio()) {
                    espectador.add(aux);
                    
                }else if (aux.getDinerodisponible()<cuevana.getPrecio()){
                    System.out.println("No tiene el dinero suficiente");
                   
                }else if (aux.getEdad()<cuevana.getPeli().getEdadminima())
                 System.out.println("Usted no cumple con la edad apta para la pelicula");
                 System.out.println("Hay mas gente en la fila para entrar a la Pelicula");
                 opcion=leer.next();
                } while (opcion.equalsIgnoreCase("S"));
             cuevana.setEspectador(espectador);
            
            
        }
     public void llenarSala(){
         sala.setPeli(cuevana.getPeli());
         sala.setEspectadores(espectador);
         Random r = new Random();
         String letra= ""; 
         for (int i = 0; i < espectador.size(); i++) {
            int fila=r.nextInt(8);
            int columna=r.nextInt(6);
             switch(columna){
                case 0:
                  letra="A";
                  break;
                 case 1:
                  letra="B";
                  break;
                 case 2:
                  letra="C";
                  break;
                  case 3:
                  letra="D";
                  break;
                   case 4:
                  letra="E";
                  break;
                   case 5:
                  letra="F";
                  break;
                      
            }
             if (!sala.getSillas()[fila][columna].contentEquals(fila+letra+"X")) {
                 sala.getSillas()[fila][columna]=fila+letra+"X";
                 
             }else{
                 System.out.println("Buscando lugar vacio");
                 i=i-1;
             }
         }
         for (int i = 0; i < 8; i++) {
             for (int j = 0; j < 6; j++) {
                 System.out.print("|"+sala.getSillas()[i][j]);
             }
             System.out.println("|");
         }
     }
   
   
   
   
   
   
   
   

   
}
