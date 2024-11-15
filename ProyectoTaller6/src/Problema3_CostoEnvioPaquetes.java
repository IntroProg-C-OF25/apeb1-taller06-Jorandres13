
import java.util.Scanner;

/*
Costo de envío de paquetes Un servicio de envío cobra diferentes tarifas según 
la región y el peso del paquete. Si el peso es menor de 5 kg y la región es 
"local", el costo es de $5. Si pesa entre 5 y 10 kg, el costo es de $10 para la 
región "nacional". Para cualquier otro caso, el costo es de $15.
 * @author Jorge Guerrero
 */
public class Problema3_CostoEnvioPaquetes {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int peso;
        double costototal;
        String region;
        System.out.print("Ingrese el peso del producto: ");
        peso = tcl.nextInt();
        System.out.print("Ingrese la region para el envio: ");
        region = tcl.next();
        if ((peso < 5) && (region.equals("local"))) {
            costototal = 5;
            System.out.println("Compra = " + costototal);
        } else {
            if ((peso >= 5) && (peso <= 10) && (region.equals("nacional"))) {
                costototal = 10;
                System.out.println("Compra = " + costototal);
            } else {
                costototal = 15;
                System.out.println("Compra = " + costototal);
            }
        }
    }
}
/*
run:
Ingrese el peso del producto: 15
Ingrese la region para el envio: nacional
Compra = 15.0
*/
