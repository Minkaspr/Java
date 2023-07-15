package J06_Arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        
        int numeros [] [] = new int [2][2];
        
        numeros [0][0] = 5;
        numeros [0][1] = 2;
        numeros [1][0] = 2;
        numeros [1][1] = 5;
        
        System.out.print("["+ numeros [0][0]+ "]");
        System.out.println("["+ numeros [0][1]+ "]");
        System.out.print("["+ numeros [1][0]+ "]");
        System.out.println("["+ numeros [1][1]+ "]");
        
        // Matrices Dinamicas
        Scanner sc = new Scanner(System.in);
        int contador = 1;
        
        System.out.println("Ingrese la cantidad de Filas");
        int filas = sc.nextInt();
        System.out.println("Ingrese la cantidad de Columnas");
        int columnas = sc.nextInt();
        
        int datos [][] = new int [filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                datos[i][j] = contador;
                contador++;
                
                System.out.print("["+datos[i][j]+"]");
            }
            System.out.println("");
        }
        
        
        
    }
}
