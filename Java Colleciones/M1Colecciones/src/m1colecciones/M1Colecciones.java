/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author usuario
 */
public class M1Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        //Listas
        ArrayList<Integer> numerosA= new ArrayList();
        int x= 20;
        numerosA.add(x);//Agregamos el número 20 a la posición 0
        
        int y = 30;
        numerosA.add(y);
        int f = 40;
        numerosA.add(f);
        int g = 50;
        numerosA.add(g);
        int j=  20;
        numerosA.add(j);
        
        for (Integer var: numerosA ) {
            System.out.println("Lista con cinco elemntos");
            System.out.println(var);
        }
       
        //Conjuntos
        
        HashSet<Integer> numerosB = new HashSet();
        Integer o = 20;
        numerosB.add(o);
        
        Integer m= 90;
        numerosB.add(m);
        Integer l = 90;
        numerosB.add(l);
        Integer d = 45;
        numerosB.add(d);
        
        
        for (Integer numero: numerosB ) {
            System.out.println("HashSet número con 5 elementos");
            System.out.println(numero);
        }
        
        
        
        
        
        //Mapas
        HashMap<Integer,String> alumnos= new HashMap();
        int dni= 34576189;
        String nombreAlumno= "Pepe";
        alumnos.put(dni,nombreAlumno); //Agregamos la llave y ek valor
        
        
        
        
        
        
        for (Map.Entry<Integer,String> entry: alumnos.entrySet())
            System.out.println("DNI="+entry.getKey()+",Nombre Alumno="+entry.getValue());
        
        
        
    }
    
}
