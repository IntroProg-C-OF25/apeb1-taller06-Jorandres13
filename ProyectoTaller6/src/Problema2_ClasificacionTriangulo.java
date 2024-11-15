/*
Clasificación de un triángulo Dado tres valores que representan las 
longitudes de los lados de un triángulo, determinar su tipo.
@author Jorge Guerrero
 */
import java.util.Scanner;

public class Problema2_ClasificacionTriangulo {

    public static void main(String[] args) {
        int ladomayor, lado1, lado2;
        Scanner tcl = new Scanner(System.in);

        System.out.print("Ingrese lado1, lado2 y lado mayor: ");
        lado1 = tcl.nextInt();
        lado2 = tcl.nextInt();
        ladomayor = tcl.nextInt();

        if ((lado1) == (lado2) && (lado1 != ladomayor) && (lado2 != ladomayor)) {
            System.out.println("Es isoseles");
        } else if ((lado1 == lado2) && (lado1 == ladomayor) && (lado2 == ladomayor)) {
            System.out.println("Es equilatero");
        } else if ((lado1 != lado2) && (lado1 != ladomayor) && (lado2 != ladomayor)) {
            System.out.println("Es escaleno");
        } else {
            System.out.println("no es triangulo");
        }

    }

}
/*
run:
Ingrese lado1, lado2 y lado mayor: 3 4 5
Es escaleno
*/
*/