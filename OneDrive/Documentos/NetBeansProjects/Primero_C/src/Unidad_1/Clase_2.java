package Unidad_1;

/**
 *Prograna para sumar dos numeros
 * @author galo0
 * @version 1.0
 * @Date 01/09/2025
 */
import java.util.Scanner;
public class Clase_2 {
   public static void main (String[] p) {
        System.out.println("Hola mundo");
        System.out.println("Soy abraham");
        System.out.println("Este programa permite sumar dos numeros");
        System.out.println("Ingrese dos numeros");
        Scanner leer=new Scanner(System.in);
        double x, y, suma;
        x=leer.nextDouble();
        y=leer.nextDouble();
        suma=x+y;
        System.out.println("El resultado de su suma es " + suma);
    }
}
