/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;


import CuentaEntidades.CuentaEntidades;
import CuentaServicios.CuentaServicios;

/**
 *
 * @author usuario
 */
public class CuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CuentaServicios CS = new CuentaServicios();
         CuentaEntidades ce = CS.CargadeDatos();
         System.out.println(ce.toString());
         CS.Ingresar(ce);
         System.out.println(ce.toString());
         CS.retirar(ce);
        CS.extraccionRapida(ce);
        CS.consultarSaldo(ce);
        CS.consultarDatos(ce);
       }
    }
    

