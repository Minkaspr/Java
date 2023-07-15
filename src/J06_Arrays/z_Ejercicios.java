package J06_Arrays;

import java.util.Scanner;

public class z_Ejercicios {
    public static void main(String[] args) {
        // Declaracion del vector
        int vector [] = new int [15];
        
        Scanner leer = new Scanner (System.in);
        
        // Cargar el vector
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el valor");
            vector [i] = leer.nextInt();
        }
        
        // Recorrer los vectores y contar cuantos 3 existe
        // contador
        int cont = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 3) {
                cont = cont + 1;
            }
        }
        
        // Mostrar el resultado
        System.out.println("La cantidad de numeros 3 que hay en el vector es: "+ cont);
        
        // ---------------------------------------------------------------------------
        System.out.println("---------------------------------------------------------");
        
        double matriz [][] = new double [4][4];
        Scanner sc = new Scanner (System.in);
        // acumulador
        double suma = 0.0;
        // Cargar la matriz
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.println("Ingrese el alumno nº "+fila);
                matriz[fila][columna] = sc.nextDouble();
                suma = suma + matriz[fila][columna];
            }
            matriz[fila][3] = suma / 3;
            suma = 0;
        }
        // Recorrer la matriz
        for (int fila = 0; fila < 4; fila++) {
            System.out.println("Las notas del alumno nº "+(fila + 1)+" son: ");
            for (int columna = 0; columna < 3; columna++) {
                System.out.println("Nota Nº" + (columna+1) +": " +matriz[fila][columna]);
            }
            System.out.println("El promedio de las notas es: "+matriz[fila][3]);
        }
        
        
        /**
         * En tres vectores diferentes se guardan los nombres, temperaturas minimas y
         * maximas de 5 ciudades de la provincia de misiones. En el primer vector se
         * guardan los nombres de las ciudades, en el segundo las temperaturas minimas
         * alcanzadas y en el tercero las temperaturas maximas alcanzadas en la ultima
         * semana. Se necesita un programa que permita la carga de las ciudades, sus
         * temperaturas minimas y maximas; ademas debera poder informar por pantalla
         * cual fue la ciudad con la temperatura mas baja y cual con la temperatura mas
         * alta (dando a conocer al mismo tiempo la cantidad de grados)
         * 
         * [lima,miraflores, ...]
         * [16,13,...]
         * [29,30,...]
         */
        Scanner scan = new Scanner(System.in);
        String ciudades[] = new String[5];
        Double minimas[] = new Double[5];
        Double maximas[] = new Double [5];
        
        for (int i = 0; i < ciudades.length; i++) {
            System.out.println("Ingrese el nombre de la ciudad "+(i+1));
            ciudades [i] = scan.next();
            System.out.println("Ingrese la temperatura minima");
            minimas [i] = scan.nextDouble();
            System.out.println("Ingrese la temperatura maxima");
            maximas [i] = scan.nextDouble();
        }
        
        // Recorremos para determinar la minima
        Double minima = 99999990.0;
        int posMin = -1;
        for (int i = 0; i < minimas.length; i++) {
            if (minimas[i] < minima) {
                minima = minimas[i];
                posMin = i;
            }
        }
        
        // Recorremos para determinar la maxima
        Double maxima = -99999990.0;
        int posMax = -1;
        for (int i = 0; i < maximas.length; i++) {
            if (maximas[i] > maxima) {
                maxima = maximas[i];
                posMax = i;
            }
        }
        
        System.out.println("La temperatura es de: " + minima);
        System.out.println("Se registro en la ciudad de: "+ ciudades[posMin]);
        System.out.println("La temperatura es de: " + maxima);
        System.out.println("Se registro en la cidad de: "+ciudades[posMax]);
    }
}
