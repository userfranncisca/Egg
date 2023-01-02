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
package Servicio;

import Entidades.Electrodomesticos;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Servicio {

    ArrayList<Electrodomesticos> elec = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearArray() {
        String f;
        do {
            System.out.println("Que electrodomesticos quieres crear?\n"
                    + "1-Lavadora\n"
                    + "2-Televisor");
            int op = leer.nextInt();
            if (op == 1) {
                Lavadora lv = new Lavadora();
                lv.crearLavadora();
                elec.add(lv);
            } else {
                Televisor tv = new Televisor();
                tv.crearTelevisor();
                elec.add(tv);

            }
            System.out.println("Desea añadir mas electrodomesticos? S/N");
            f = leer.next();
        } while (f.equalsIgnoreCase("S"));

    }

    public void mostrarArray() {
        double preciototal = 0, preciolavadora = 0, preciotelevisor = 0;
        for (Electrodomesticos aux1 : elec) {
            if (aux1 instanceof Lavadora) {
                preciototal += aux1.getPrecio();
                preciolavadora += aux1.getPrecio();
            }
            if (aux1 instanceof Televisor) {
                preciototal += aux1.getPrecio();
                preciotelevisor += aux1.getPrecio();

            }

        }

        System.out.println("Precio total de los electrodomesticos: " + preciototal);
        System.out.println("Precio de las lavadoras: " + preciolavadora);
        System.out.println("Precio total de los televisores: " + preciotelevisor);

    }

}
