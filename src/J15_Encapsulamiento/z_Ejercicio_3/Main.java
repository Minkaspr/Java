package J15_Encapsulamiento.z_Ejercicio_3;

import java.util.Scanner;

public class Main {
    /**
     * Diseñar un programa para trabajar con triángulos isósceles. Para ello defina
     * los atributos necesarios que se requieren, proporcione métodos de consulta,
     * un método constructor e implemente métodos para calcular el perímetro y 
     * el área de un triángulo, además implementar un método que a partir de un
     * arreglo de triángulos devuelva el área del triángulo de mayor superficie.
     */
    
    public static double mayorArea(TrianguloIsosceles triangulos[]){
        double area;
        
        area = triangulos[0].obtenerArea();
        for (int i = 1; i < triangulos.length; i++) {
            if (triangulos[i].obtenerArea() > area) {
                area = triangulos[i].obtenerArea();
            }
        }
        return area;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double base, lado;
        int nTriangulos;
        
        System.out.println("Digite el numero de triangulos a ingresar");
        nTriangulos = sc.nextInt();
        
        TrianguloIsosceles triangulos[] = new TrianguloIsosceles[nTriangulos];
        
        for (int i = 0; i < triangulos.length; i++) {
            System.out.println("\nDigite los valores para el triangulo "+(i+1)+" :");
            System.out.println("Introduzca la base: ");
            base = sc.nextDouble();
            System.out.println("Introduzca el lado: ");
            lado = sc.nextDouble();
            
            triangulos[i] = new TrianguloIsosceles(base, lado);
            
            System.out.println("\nEl perimetro del triangulo es: "+triangulos[i].obtenerPerimetro());
            System.out.println("El area del triangulo es: "+triangulos[i].obtenerArea());
        }
        
        System.out.println("\nEl area del triangulo de mayor superficie es: "+Main.mayorArea(triangulos));
    }
}
