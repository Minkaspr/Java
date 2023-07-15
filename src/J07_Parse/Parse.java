package J07_Parse;

import java.util.Scanner;

public class Parse {
    public static void main(String[] args) {
        
        /**
         * Parse
         * 
         * El método parse se utiliza para cambiar datos de tipo String a cualquier otro tipo de dato. 
         * Toma una cadena como entrada y devuelve el valor convertido al tipo de dato correspondiente.
         * 
         * Estructura:
         * <Tipo de dato>.parse<TipoDato>(<Variable String>)
         * 
         * Ejemplo:
         *  int numero = Integer.parseInt("123");
         *  En este caso, se convierte la cadena "123" en un número entero (int) y se almacena en la variable numero.
         */
        Scanner sc = new Scanner(System.in);
        int resultado;
        
        System.out.println("Ingrese el 1er numero");
        String num1 = sc.next();
        
        System.out.println("Ingrese el 2do numero");
        int num2 = Integer.parseInt(sc.next());

        System.out.println("Ingrese el 3er numero");
        int num3 = sc.nextInt();
        
        resultado = Integer.parseInt(num1) + num2 + num3;
        
        System.out.println("El resultado es: "+resultado);
    }
}
