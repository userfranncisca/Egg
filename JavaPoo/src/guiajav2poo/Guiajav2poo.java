/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajav2poo;

import guia2ent.guia2ent;
import guia2service.guia2servi;

/**
 *
 * @author usuario
 */
public class Guiajav2poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      guia2servi entrada = new guia2servi();
      guia2ent Circunferencia = entrada.CrearCircunferencia();
        System.out.println("El area de la circunferencia es");
        
    }
    
}
