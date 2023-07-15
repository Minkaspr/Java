package J02_Operadores;

public class Operadores {

    public static void main(String[] args) {
        /**
         * Prioridad entre operadores 
         *  1ro -> Parentesis () 
         *  2do -> Potencia ^ 
         *  3ro -> Multiplicacion y Division 
         *  4to -> Suma y Resta +,-
         */

        int num1 = 4;
        int num2 = 4;
        int resultado;

        resultado = num1 + num2 / 2;
        System.out.println("1er resultado es: "+ resultado); // -> 6
    
        resultado = (num1 + num2) / 2;
        System.out.println("2do resultado es: "+ resultado); // -> 3
        
        /**
         * Operadores aritmeticos
         * 
         * '+'      Suma
         * '-'      Resta
         * '*'      Multiplicacion
         * '/'      Adicion
         */
        

        /**
         * Operadores Relacionales
         * 
         *  '<'     menor que
         *  '>'     mayor que
         *  '=='    igual a
         *  '!='    diferente a
         *  '<='    menor igual a
         *  '>='    mayor igual a
         */

        /**
         * Operadores Lógicos <> Condicionales
         * 
         *  '&&'    y
         *  '||'    o
         *  '!'     not o negacion
         */
        
        
    }

}
