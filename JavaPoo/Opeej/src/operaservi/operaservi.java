/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaservi;

import java.util.Scanner;
import operaent.operaent;

/**
 *
 * @author usuario
 */
public class operaservi {
    Scanner leer = new Scanner(System.in);
    public operaent CrearOperacion(){
        operaent Operaciones= new operaent();
        System.out.println("Ingrese el número 1");  
        Operaciones.setNumero1(leer.nextInt());
        System.out.println("Ingrese el número 2");
        Operaciones.setNumero2(leer.nextInt());
        
        return Operaciones;
     
        
    }
     public int sumar(operaent ope){
        return ope.getNumero1()+ ope.getNumero2();
     }
     public int restar(operaent ope){
         return ope.getNumero1()- ope.getNumero2();
     }
    public int multiplicar( operaent ope){
        if (ope.getNumero1()==0||ope.getNumero2()==0){
                return 0;
        }else return ope.getNumero1()*ope.getNumero2();
        
    }
    public int dividir(operaent ope){
        if (ope.getNumero2()==0){
            return -1;
            
        }else return ope.getNumero1()/ope.getNumero2();
        
    }

}
    
 
            
 




  
