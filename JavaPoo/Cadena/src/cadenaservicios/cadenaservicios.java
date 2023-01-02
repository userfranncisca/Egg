/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenaservicios;

import cadena.cadena;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class cadenaservicios {
    Scanner leer= new Scanner (System.in).useDelimiter("\n");
     String nuevaf;   
   public cadena ingresarfrase(){
       cadena f1=  new cadena();
       System.out.println("Ingrese una frase");
       f1.setFrase(leer.next());
       f1.setLongitud(f1.getFrase().length());
       return f1;
   }    
    public int contarVocales(cadena f1){
        int vocales=0;
        for (int i = 0; i < f1.getLongitud(); i++) {
            if((f1.getFrase().substring(i, i+1).equalsIgnoreCase("A"))||(f1.getFrase().substring(i, i+1).equalsIgnoreCase("E"))||(f1.getFrase().substring(i, i+1).equalsIgnoreCase("I"))||f1.getFrase().substring(i, i+1).equalsIgnoreCase("O")||f1.getFrase().substring(i, i+1).equalsIgnoreCase("U")){
                vocales ++;
            }
        }
        return vocales;
    }
   public String invertirFrase(cadena f1){
       String invertida= "";
       for (int i = f1.getLongitud()-1; i >=0; i--) {
           invertida+= f1.getFrase().charAt(i);
       }
     return invertida;
   }
   public int vecesRepetidos(cadena f1){
       int  veces= 0;
       System.out.println("Ingrese un caracter para buscar");
       String caracter= leer.next();
       for (int i = 0; i < f1.getLongitud(); i++) {
           if (f1.getFrase().substring(i,i+1).equalsIgnoreCase(caracter)) {
               veces++;
           }
           
           
       }
      return veces;
   }
   public int metodoCompara(cadena f1){
       
       int contador=0;
       System.out.println("Ingrese una frase nueva");
       nuevaf=leer.next();
       int longi = nuevaf.length();
       if (f1.getLongitud()==longi) {
           System.out.println("Las longitudes de las frases son iguales ");
       }else{
           System.out.println("Las longitudes de las frases son diferentes");
       }
       contador++;
       return contador;
   } 
   
   public void unirFrases(cadena f1){
       System.out.println("El resultado de las frases es: "+f1.getFrase()+nuevaf);
   }
   
   public void reemplazar(cadena f1){
       String caracter, cambiada;
       System.out.println("Ingrese el caracter que desee reemplazar por la Letra A");
       caracter=leer.next();
       String FRASE=f1.getFrase().toLowerCase();
       cambiada=FRASE.replace("a", caracter);
       System.out.println("La frasa modificada es;"+cambiada);
   }
   public boolean contiene(cadena f1){
       boolean bandera= false;
       System.out.println("Ingrese una letra");
       String letra= leer.next();
       for (int i = 0; i < f1.getLongitud(); i++) {
           if (f1.getFrase().substring(i,i+1).equalsIgnoreCase(letra)) {
               bandera=true;
           }
  
       }return bandera;
   }
   
}
