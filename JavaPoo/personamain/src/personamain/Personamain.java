/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personamain;

import java.util.Scanner;
import persona.persona;
import personaserv.Personaserv;




/**
 *
 * @author usuario
 */
public class Personamain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Personaserv per = new Personaserv();
        
        persona[]pers = new persona[4];
        
        
        for (int i = 0; i < 4; i++) {
            pers[i]= per.Cargadedatos();
        }
       
        System.out.println("menu\n"
                         +"1.evaluacion IMC\n"
                         +"2. evaluacion edad\n" 
                         +"3.SALIR");  
                int peso = 0, peso1 = 0, peso2 = 0, opcion = 0;
        do {
            System.out.println("menu\n"
                    + "1.evaluacion IMC\n"
                    + "2.evaluacion edad\n"
                    + "3.salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    for (int i = 0; i < 4; i++) {
                        if (per.calcularImc(pers[i]) == -1) {
                            peso++;
                        } else if (per.calcularImc(pers[i]) == 0) {
                            peso1++;
                        } else if (per.calcularImc(pers[i]) == 1) {
                            peso2++;
                        }

                    }
                    System.out.println("el porcentaje de personas con bajo peso es " + (peso * 100 / 4) + " %");
                    System.out.println("el porcentaje de personas con peso normal es " + (peso1 * 100 / 4) + " %");
                    System.out.println("el porcentaje de personas con exceso de peso es " + (peso2 * 100 / 4) + " %");
                    break;
                case 2:
                    int mayor = 0,
                     menor = 0;
                    for (int i = 0; i < 4; i++) {
                        if (per.esMayordeEdad(pers[i])) {
                            mayor++;
                        } else {
                            menor++;
                        }

                    }
                    System.out.println("el porcentaje de personas mayor de edad es " + mayor * 100 / 4 + " %");
                    System.out.println("el porcentaje de personas menores de edad es " + menor * 100 / 4 + " %");
                    break;
                case 3:
                    System.out.println("usted ha salido del menu");
                    break;

            }

        } while (opcion !=3);

                                  
      
      
      
      
      
      
      
      
      
    }
     
    
    
    
    
    
    }

    
            
