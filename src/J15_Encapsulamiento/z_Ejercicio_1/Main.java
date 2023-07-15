package J15_Encapsulamiento.z_Ejercicio_1;

import java.util.Scanner;

public class Main {
    /**
     * Construir un programa que calcule el área y el perímetro de un cuadrilátero dada
     * la longitud de sus dos lados. Los valores de la longitud deberán introducirse
     * por línea de ordenes. Si es un cuadrado, sólo se proporcionará la longitud
     * de uno de los lados
     */
    
    public static void main(String[] args) {
        Cuadrilatero c1;
        float lado1,lado2;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el lado 1");
        lado1 = sc.nextFloat();
        System.out.println("Digite el lado 2");
        lado2 = sc.nextFloat();
        
        if (lado1 == lado2) {
            c1 = new Cuadrilatero(lado1);
        } else {
            c1 = new Cuadrilatero(lado1, lado2);
        }
        
        System.out.println("El perimetro es: "+c1.getPerimetro());
        System.out.println("El area es:"+c1.getArea());
    }
}
