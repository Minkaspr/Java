package J06_Arrays;

import java.util.Scanner;

public class Vector {
    public static void main(String[] args) {
        // Declarar vector
        int numeros [] = new int [5];
        
        // Asignamos los valores a cada posicion
        numeros[0] = 5;
        numeros[1] = 120;
        numeros[2] = 32;
        numeros[3] = 8;
        numeros[4] = 99;
        
        System.out.print("["+numeros[0]+"]");
        System.out.print("["+numeros[1]+"]");
        System.out.print("["+numeros[2]+"]");
        System.out.print("["+numeros[3]+"]");
        System.out.print("["+numeros[4]+"]\n\n");
        
        /**
         * Vector Dinámico
         */
        
        int num [] = new int [5];
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 10;
        }
        
        // Ejemplos
        int longitud;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cuantos Numeros Deseas ingresar?");
        longitud = sc.nextInt();
        // Declaramos el vector
        int datos [] = new int[longitud];
        // Llenamos el vector de valores
        for (int i = 0; i < datos.length; i++) {
            System.out.println("Ingrese el valor del dato #"+(i+1));
            datos[i] = sc.nextInt();
        }
        // Recorremos el vector mostrando los valores
        for (int i = 0; i < datos.length; i++) {
            System.out.print("["+datos[i]+"]");
        }
        
        
        
    }
}
