/*
 *a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package matematicaservicios;

import java.util.Scanner;
import matematica.matematica;

/**
 *
 * @author usuario
 */
public class matematicaservicios {
    Scanner leer= new Scanner(System.in);
    public matematica Cargardatos(){
    matematica mt = new matematica();
        System.out.println("Vamos a ingresar los dos numero aleatorios");
        mt.setNum1(Math.random()*10);
        mt.setNum2(Math.random()*10);
        System.out.println(mt.getNum1());
        System.out.println(mt.getNum2());
       
        
    return mt;          
 }
    public double devolverMayor(matematica mt){
        double mayor;
        mayor= Math.max(mt.getNum1(), mt.getNum2());
        return mayor;
       }
    public double calcularPotencia(matematica mt){
        double aux,poten,redon,redon1;
        redon=Math.round(mt.getNum1());
        System.out.println(redon);
        redon1=Math.round(mt.getNum2());
        System.out.println(redon1);
        aux=Math.max(mt.getNum1(), mt.getNum2());
        if (aux==redon) {
            poten=Math.pow(redon, redon1);
        }else{
            poten=Math.pow(redon1,redon);
        }
        return poten;
    }
    public double calcularRaiz(matematica mt){
        double aux,raiz,abso;
        aux= Math.min(mt.getNum1(),mt.getNum2());
        abso=Math.abs(aux);
        raiz=Math.sqrt(abso);
        return raiz;
    }
}
            
   

    

