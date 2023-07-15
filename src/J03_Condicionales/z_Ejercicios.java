package J03_Condicionales;

import java.util.Scanner;

public class z_Ejercicios {
    public static void main(String[] args) {
        /**
         * 1 - 
         *  Una pequeña despensa desea calcular los sueltos de  sus empleados
         *  Los puestos de los mismos pueden tener 3 categorias: 1 - repositor,
         *  2 - cajeor y 3 - supervisor.
         * 
         *  a) Los repositores cobran $15.890 + un bono de 10%.
         *  b) Los cajeros cobran $25.630,89 fijos
         *  c) Los supervisores cobran $35.560,20 en bruto al cual se les descuenta 
         *      un 11% de jubilacion
         * 
         *  Se necesita una aplicacion que, dependiendo el tipo de empleado del que
         *  se trate, calcule y muestre en pantalla el correspondiente sueldo.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tipo de empleado");
        int tipoEmpleado = sc.nextInt();
        
        double sueldo =0;
        if (tipoEmpleado == 1) {
            sueldo = 15890 + (15890*0.1);
        } else if (tipoEmpleado == 2) {
            sueldo = 2563089;
        } else if (tipoEmpleado == 3){
            sueldo = 3556020 - (3556020*0.11);
        } else {
            System.out.println("Ingresó un número de categoría incorrecta");
        }
        
        if (tipoEmpleado == 1 || tipoEmpleado == 2 || tipoEmpleado == 3) {
            System.out.println("Tipo de empleado: " + tipoEmpleado);
            System.out.println("El sueldo de la persona es: "+ sueldo);
        }
    }
}
