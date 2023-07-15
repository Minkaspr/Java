package J05_Cadenas;

import java.util.Scanner;

public class Cadenas {
    public static void main(String[] args) {
        /**
         * Comparar una cadena de texto
         * 
         *  String nombre = ""
         *  nombre == "Minka"
         *  nombre.equals("Minka")
         * 
         * 'equals' -> Evalua si son iguales teniendo en cuenta la mayuscula y miniscula
         * 'equalsIgnoreCase' -> Evalua si son iguales pero no tiene en cuenta la diferencia entre mayuscula con minuscula
         */
        
        Scanner sc = new Scanner(System.in);
        String nom1="",nom2="";
        
        System.out.println("Ingrese el primer nombre");
        nom1=sc.nextLine();
        
        System.out.println("Ingrese el segundo nombre");
        nom2=sc.nextLine();
        
        if (nom1.equals(nom2)) {
            System.out.println("Los nombres son iguales");
        } else if(nom1.equalsIgnoreCase(nom2)){
            System.out.println("Los nombres son iguales ignorando la mayuscula y minuscula");
        } else {
            System.out.println("Los nombres son diferentes");
        }
    }
}
