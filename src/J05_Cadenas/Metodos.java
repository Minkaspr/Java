package J05_Cadenas;

import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {
        
        /**
         * Metodos para gestionar con las cadenas:
         * 
         *  
         *  'substring(desde,hasta)'    -> Obtenemos una parte de la cadena
         *  'length()'    -> Obtenemos la cantidad de caracteres de la cadena
         */
        
        String cadenaOriginal="";
        String cadenaSubstaccion="";
        int numCaracteres = 0, desde =0, hasta=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una cadena de caracteres: ");
        cadenaOriginal=sc.nextLine();
        
        numCaracteres = cadenaOriginal.length();
        System.out.println("La cadena contiene "+ numCaracteres+" caracteres");
        
        System.out.println("¿Desde que caracter deseas obtener la nueva cadena?");
        desde = sc.nextInt();
        
        System.out.println("¿Hasta que caracter deseas obtener la nueva cadena?");
        hasta = sc.nextInt();
        
        cadenaSubstaccion = cadenaOriginal.substring(desde, hasta);
        System.out.println("La nueva cadena es: "+cadenaSubstaccion);
    }
}
