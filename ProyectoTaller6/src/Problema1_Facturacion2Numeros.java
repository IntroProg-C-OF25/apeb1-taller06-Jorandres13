
import java.util.Scanner;

/*Facturación de 2 productos: La empresa Amazon.com le contrata como 
desarrollador de Sistemas Informáticos para programar su sistema de compras 
online, el cual calcule el precio total de la compra para un cliente. Para ello,
se necesita utilizar estructuras secuenciales y de selección 
(if simple, doble y/o anidadas), sin aplicar ciclos repetitivos.
@author Jorge Guerrero
 */
public class Problema1_Facturacion2Numeros {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        double costoProducto1, costoProducto2, costoEnvio, costoFinal, iva, subtotal, descuento;

        System.out.print("Ingrese el costo del producto 1: ");
        costoProducto1 = tcl.nextDouble();

        System.out.print("Ingrese el costo del producto 2: ");
        costoProducto2 = tcl.nextDouble();

        System.out.print("Ingrese el costo de envio: ");
        costoEnvio = tcl.nextDouble();

        iva = (costoProducto1 + costoProducto2) * 0.1;
        subtotal = iva + (costoProducto1 + costoProducto2);
        descuento = subtotal * 0.05;

        if ((subtotal >= 1000) && (subtotal < 5000)) {
            System.out.println("Tiene descuento del 20%");
            descuento = (subtotal * 0.2);
            costoFinal = subtotal - descuento + costoEnvio;
            System.out.println("Costo final = " + costoFinal);
        } else {
            System.out.println("Tiene descuento del 20% y el envio es gratuito");
            descuento = (subtotal * 0.2);
            costoFinal = subtotal - descuento;
            System.out.println("Costo final = " + costoFinal);
        }

    }

}
/* Ingrese el costo del producto 1: 574
Ingrese el costo del producto 2: 786
Ingrese el costo de envio: 10
Tiene descuento del 20%
Costo final = 1206.8
*/
