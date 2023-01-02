/*
 * Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */
package HerenciaMain3;


import Entidades.Lavadora;
import Entidades.Televisor;
import Servicio.Servicio;

/**
 *Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 * @author usuario
 */
public class HerenciaMain3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
//         Lavadora lv= new Lavadora();
//         lv.crearLavadora();
//         System.out.println(lv.toString());
//         Televisor tele = new Televisor();
//         tele.crearTelevisor();
//         System.out.println(tele.toString());
         Servicio sv = new Servicio ();
         sv.crearArray();
         sv.mostrarArray();
         
         
        
        
        
       
        
    }
    
}
