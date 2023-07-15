package J16_ClasesAbastractas.z_Ejercicio_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /**
    *   Hacer un programa para calcular el área de poligonos(triangulo y rectangulo).
    *   El programa debe ser capaz de almacenar en un arreglo N triangulos y rectangulos
    *   y al final mostrar el area y los datos de cada uno. Para ello, se tendrá lo siguiente:
    *   
    *   - Una super clase llamada Poligono
    *   - Una sub clase llamada Rectangulo
    *   - Una sub clase llamada Triangulo
    * 
    */  
    
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner entrada = new Scanner(System.in); 
    
    public static void main(String[] args) {
        llenarPoligono();
        
        //Mostrar los datos y el area de cada poligono
        mostrarResultados();
    }
    
    public static void llenarPoligono(){
        int opcion;
        char respuesta;
        do {        
            do {                
                System.out.println("Digite que poligono desea");
                System.out.println("1. Triangulo");
                System.out.println("2. Rectangulo");
                System.out.println("Opcion: ");
                opcion = entrada.nextInt();
            } while (opcion < 1 || opcion > 2);
            
            switch (opcion) {
                case 1:
                    llenarTriangulo();
                    break;
                case 2:
                    llenarRectangulo();
                    break;
            }
            System.out.println("\nDesea introducir otro poligono (s/n): ");
            respuesta = entrada.next().charAt(0);
            System.out.println("");
        } while (respuesta == 's' || respuesta == 'S');
    }
    
    public static void llenarTriangulo(){
        double lado1,lado2,lado3;
        System.out.println("\nDigite el lado 1 del triangulo: ");
        lado1 = entrada.nextDouble();
        System.out.println("\nDigite el lado 2 del triangulo: ");
        lado2 = entrada.nextDouble();
        System.out.println("\nDigite el lado 3 del triangulo: ");
        lado3 = entrada.nextDouble();
        
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        // Guardamos un triangulo dentro del arreglo de poligonos
        poligono.add(triangulo);
    }
    
    public static void llenarRectangulo(){
        double lado1,lado2;
        System.out.println("\nDigite el lado 1 del rectangulo: ");
        lado1 = entrada.nextDouble();
        System.out.println("\nDigite el lado 2 del rectangulo: ");
        lado2 = entrada.nextDouble();
        
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        
        poligono.add(rectangulo);
    }
    
    public static void mostrarResultados(){
        // Recorriendo el arreglo de poligonos
        for (Poligono poli : poligono) {
            System.out.println(poli.toString());
            System.out.println("Area: "+poli.area());
            System.out.println("");
        }
    }
}
