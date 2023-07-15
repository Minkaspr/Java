package J03_Condicionales;

import java.util.Scanner;

public class If_Else_Anidadas {

    public static void main(String[] args) {

        /**
         * Condicional If - Else Anidada
         */
        
        int operacion = 1;
        int num1 = 8;
        int num2 = 4;
        int resultado = 0;
        
        // Estructura condicional anidada
        if (operacion == 1) {
            // Solo se ejecutará este segmento de código
            resultado = num1 + num2; // -> 12
            System.out.println("El resultado de la suma es: "+resultado); // <-
        } else if (operacion == 2) {
            resultado = num1 - num2;
            System.out.println("El resultado de la resta es: "+resultado);
        } else if (operacion == 3) {
            resultado = num1 * num2;
            System.out.println("El resultado de la multiplicación es: "+resultado);
        } else if (operacion == 4) {
            resultado = num1 / num2;
            System.out.println("El resultado de la división es: "+resultado);
        } else {
            System.out.println("La opción que eligiste no existe");
        }
        
        
        /**
         * Leer pon consola
         * Se usa una liberia Scanner
         * Creamos un objeto de tipo scanner
         * utilizamos el metodo 'nextLine' 
         *      para introducir dentro de la variable de tipo string
         * utilizamos el metodo 'nextInt'
         *      para introducir dentro de la variable de tipo int
         */
        
        Scanner in = new Scanner(System.in);
        
        String nombre;
        int num_1=0, num_2=0,result =0;
        System.out.println("¿Cual es tu nombre?");
        nombre = in.nextLine();
        
        System.out.println("Dame el primer valor para tu suma");
        num_1 = in.nextInt();
        
        System.out.println("Dame el segundo valor para tu suma");
        num_2 = in.nextInt();
        
        result = num_1 + num_2;
        System.out.println("Hola "+nombre+", el resultado de tu suma es: "+result);
    }
}
