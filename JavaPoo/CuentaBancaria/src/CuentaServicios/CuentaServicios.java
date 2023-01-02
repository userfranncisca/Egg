/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuentaServicios;

import CuentaEntidades.CuentaEntidades;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class CuentaServicios {
    
   Scanner leer = new Scanner (System.in);
   public CuentaEntidades CargadeDatos(){
     CuentaEntidades Cuenta =  new CuentaEntidades();
       System.out.println("Ingrese su Nombre");
       Cuenta.setNombre(leer.nextLine());
       System.out.println("Ingrese Apellido");
       Cuenta.setApellido(leer.nextLine());
       System.out.println("Ingrese Número de Cuenta");
        Cuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su DNI");
        Cuenta.setDNI(leer.nextInt());
       System.out.println("Saldo Actual");
       Cuenta.setSaldoActual(leer.nextInt());
       return Cuenta;
   }
   public void Ingresar(CuentaEntidades Cuenta){
       System.out.println("Ingrese la cantidad a ingresar");
       double deposito= leer.nextDouble();
       Cuenta.setSaldoActual(Cuenta.getSaldoActual()+(int)deposito);
       System.out.println("Tu saldo quedá en "+Cuenta.getSaldoActual());
}
   public void retirar(CuentaEntidades retirar){
       System.out.println("Ingrese la Cantidad que retirará"); 
       double monto= leer.nextDouble();
       if (monto>retirar.getSaldoActual()) {
           System.out.println("El Saldo a retirar supera el monto inicial");
           retirar.setSaldoActual(0);
       }else{
           retirar.setSaldoActual(retirar.getSaldoActual()- (int) monto);
     } 
       System.out.println("El saldo te quedó en "+retirar.getSaldoActual());
   }
    public void extraccionRapida(CuentaEntidades ext){
        double extraer;
        System.out.println("Monto Disponible a retirar (20%)"+(short)(ext.getSaldoActual()*0.20));
        System.out.println("¿Cuanto quieres sacar?");
        extraer= leer.nextDouble();  
        if (extraer>0.20*ext.getSaldoActual()) {
            System.out.println("Su monto excedio el limite disponible");
        }else{
            ext.setSaldoActual(ext.getSaldoActual()-(int) extraer);
        }System.out.println("El Saldo Actual es "+ext.getSaldoActual());
    }
       public void consultarSaldo(CuentaEntidades c){
           System.out.println("Su saldo es "+c.getSaldoActual());
       }
       public void consultarDatos(CuentaEntidades d){
           System.out.println(d.toString());
       }
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       

   



   
   
       
  
    
    
    
    
    
    
    
    
    
    
    
}
