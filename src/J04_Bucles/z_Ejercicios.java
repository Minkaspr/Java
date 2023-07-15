package J04_Bucles;

import java.util.Scanner;

public class z_Ejercicios {
    public static void main(String[] args) {
        
        /**
         * 1) Crear la secuencia 1,3,5,7,9
         */
        
        System.out.println("Serie con for: ");
        for (int i = 1; i < 10; i+=2) {
            if (i <9) {
                System.out.print(i+",");
            } else {
                System.out.print(i);
            }
        }
        // Serie con For
        // 1,3,5,7,9
        
        System.out.println("\nSerie con while:");
        int i =1;
        while (i <= 10) {            
            if (i < 9) {
                System.out.print(i + ",");
            } else {
                System.out.print(i);
            }
            i+=2;
        }
        // Serie con While
        // 1,3,5,7,9
        
        System.out.println("\nSerie con Do While");
        i = 1;
        do {
            if (i < 9) {
                System.out.print(i + ",");
            } else {
                System.out.print(i);
            }
            i+=2;
        } while (i <= 10);
        // Serie con Do While
        // 1,3,5,7,9
        
        System.out.println("\n---------------------------------------------------");
        
        /**
         * 2) Crear la secuencia 1,99,2,98,3,97,4,96,5,95
         */
        
        System.out.println("Serie con for:");
        int j = 1, k= 99;
        for (j = 1; j <= 5; j++) {
            if (j < 5) {
                System.out.print(j+",");
                System.out.print(k+",");
            } else {
                System.out.print(j+",");
                System.out.println(k);
            }
            k--;
        }
        // Serie con for:
        // 1,99,2,98,3,97,4,96,5,95
    
        System.out.println("Serie con while");
        j = 1;
        k = 99;
        while (j <= 5) {            
            if (j < 5) {
                System.out.print(j+",");
                System.out.print(k+",");
            } else {
                System.out.print(j+",");
                System.out.println(k);
            }
            j++;
            k--;
        }
        // Serie con while
        // 1,99,2,98,3,97,4,96,5,95
        
        System.out.println("Serie con do-while");
        j=1;
        k=99;
        do {
            if (j < 5) {
                System.out.print(j+",");
                System.out.print(k+",");
            } else {
                System.out.print(j+",");
                System.out.println(k);
            }
            j++;
            k--;
        } while (j <= 5);
        
        
        /**
         * Realizar un programa que dado por teclado un muestre en pantalla todos
         * los numeros hasta el limite empezando del 1
         */
        
        System.out.println("Ingrese el limite hasta el que quiere contar");
        Scanner sc = new Scanner(System.in);
        int limite = sc.nextInt();
        
        int cont = 1;
        while (cont <= limite) {            
            System.out.println(cont);
            cont++;
        }
        
        // o
        
        for (int l = 0; l < limite; l++) {
            System.out.println(l+1);
        }
        
        /**
         * Realizar un programa que muestre en pantalla palabras que sean ingresadas
         * por teclado hasta que se ingrese la palabra 'salir'
         */
        System.out.println("Ingrese una palabra");
        String palabra = sc.next();
        
        while (!palabra.equals("salir")) {            
            System.out.println("La palabra es: "+palabra);
            palabra = sc.next();
        }
        
        /**
         * En la ciudad de Oberá, Misiones se realiza año a año la "Maratón del Inmigrante"
         * en el marco de la Fiesta Nacional del Inmrigante. El evento cuenta con un dia
         * de inscripciones el dia anterior a la carrera, por lo que se desconoce la cantidad
         * exacta de inscriptos que puede llegar a haber. Desde la Federacion de Colectividades,
         * manifestaron que se solicitan los siguientes datos para la inscripcion de cada 
         * particiante: dni, nombre y edad.
         * 
         * En cuanto a las categorias posibles para una inscripcion, se manejan las siguientes:
         * Menores A (de 6 a 10 años)
         * Menores B (de 11 a 17 años)
         * Juveniles (de 18 a 30 años)
         * Adultos (de 31 a 50 años)
         * Adultos mayores (mayores de 50 años)
         * 
         * Se necesita un programa que, a partir del ingreso de los datos y edad de cada
         * participante, se muestre por pantalla a que categoria debe ser inscrito. Cabe 
         * destacar que, al finalizar el dia, para dar fin a las inscripciones, se debe ingresar un dni
         * con el valor 0 y un nombre con la palabra fin
         */
        
        System.out.println("Ingrese el dni de la persona");
        String dni = sc.nextLine();
        System.out.println("Ingrese el nombre de la persona");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la edad de la persona");
        int edad = sc.nextInt();
        
        while (!dni.equals("0") && !nombre.equalsIgnoreCase("fin")) {            
            if (edad >= 6 && edad <=10) {
                System.out.println("La categoria es Menores A");
            } else if(edad >= 11 && edad <=17){
                System.out.println("La categoria es Menores B");
            } else if (edad >= 18 && edad <= 30){
                System.out.println("La categoria es Juveniles");
            } else if (edad >= 31 && edad <=50){
                System.out.println("La categoria es Adultos");
            } else if (edad >=51) {
                System.out.println("La categoria es Adultos Mayores");
            } else {
                System.out.println("La persona no cuenta con la edad indicada");
            }
        }
        System.out.println("Ingrese el dni de la persona");
        dni = sc.nextLine();
        System.out.println("Ingrese el nombre de la persona");
        nombre = sc.nextLine();
        System.out.println("Ingrese la edad de la persona");
        edad = sc.nextInt();
        System.out.println("------------");
        System.out.println("dni: "+ dni);
        System.out.println("nombre: "+nombre);
    }
}
