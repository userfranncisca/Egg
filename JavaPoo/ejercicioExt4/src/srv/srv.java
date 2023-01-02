/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srv;

import ent.ent;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class srv {
    ent entidad= new ent();
    Scanner leer= new Scanner(System.in);
    
    public void crearNif(){
        System.out.println("Ingrese su DNI");
        entidad.setDNI(leer.nextLong());
        
        String[] letra= new String[]{"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        int resultado=0;
        resultado=(int)(entidad.getDNI()%23);
        entidad.setLetra(letra[resultado]);
        
        
    }
    public void Mostrar(){
        System.out.println("Este es su DNI");
        System.out.println(entidad.getDNI()+"-"+entidad.getLetra());
   
    }
   
    
    
}
