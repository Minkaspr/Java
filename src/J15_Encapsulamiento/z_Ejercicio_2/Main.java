package J15_Encapsulamiento.z_Ejercicio_2;

import java.util.Scanner;

public class Main {
    /**
     * Construir un programa que dada una serie de vehiculos caracterizados por su marca,
     * modelo y precio, imprima las propiedades del vehiculo más barato. Para ello, se
     * deberán leer por teclado las características de cada vehículo y crear una
     * clase que represente a cada uno de ellos.
     */
    
    public static int indiceCocheBarato(Vehiculo coches[]){
        float precio;
        int indice = 0;
        
        precio = coches[0].getPrecio();
        for (int i = 1; i <coches.length ; i++) {
            if (coches[i].getPrecio() <precio) {
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String marca,modelo;
        float precio;
        int numVehiculos, indiceBarato;
        
        System.out.println("Digite la cantidad de vehiculos: ");
        numVehiculos = sc.nextInt();
        
        // Creamos los objetos para los coches
        Vehiculo coches[] = new Vehiculo[numVehiculos];
        for (int i = 0; i < coches.length; i++) {
            sc.nextLine();
            System.out.println("\nDigite las caracteristicas del coche "+(i+1)+":");
            System.out.println("Indroduzca Marca:");
            marca = sc.nextLine();
            System.out.println("Indroduzca Modelo:");
            modelo = sc.nextLine();
            System.out.println("Indroduzca Precio:");
            precio = sc.nextFloat();
            
            coches[i] = new Vehiculo(marca, modelo, precio);
        }
        
        indiceBarato = indiceCocheBarato(coches);
        System.out.println("\nEl coche mas barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());
    }
}
