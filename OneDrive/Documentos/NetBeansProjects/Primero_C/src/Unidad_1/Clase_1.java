package Unidad_1;

/**
 *Programa que calcula el area de un triangulo 
 * @author Abraham y Harvy Sanmartin
 * @data 29/08/2025
 */
import java.util.Scanner;
public class Clase_1 {
    public static void main (String[]args){
        double b, h, area;
        Scanner lector= new Scanner(System.in);
        System. out. println("Cualculo del area de un triangulo");
         System.out.println("Ingrese la Base");
         b=lector.nextDouble();
         System.out.println("Ingrese la Altura");
         h=lector.nextDouble();
         area = (b*h)/2;
         System.out.println ("Triangulo de base " + b + " y la altura" + h);
         System.out.println ("Su area es: " + area);
    }
}