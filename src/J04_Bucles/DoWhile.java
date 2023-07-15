package J04_Bucles;

public class DoWhile {

     public static void main(String[] args) {
        /**
         * Do While
         * 
         * do {
         *      <instrucciones>
         * } while (condicion);
         * 
         * Nota: No permite declarar la variable dentro de la condicion
         * Se ejecuta siempre 1 vez
         */
        
        // Decrementar 20 en 20
        int i = 100;
        do {
            System.out.print(i+",");    // -> 100,80,60,40,20,0
            i-=20;
        } while (i >= 0);
    }
}
