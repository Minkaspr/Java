package J04_Bucles;

public class For {
    public static void main(String[] args) {
        
        /**
         * For
         * 
         * for(<inicio>; <condicion>; <incremento>){
         *      <instruccion>
         * }
         */
        
        // Incrementar 1 en 1
        for (int i = 1; i <= 5; i++) {
            System.out.print(i+","); // -> 1,2,3,4,5,
        }
        
        // Incrementar 4 en 4
        for (int i = 1; i <= 20; i+=4) {
            System.out.print(i+","); // -> 1,5,9,13,17,
        }
        
        // Decrementar 1 en 1
        for (int i = 5; i >= 0; i--) {
            System.out.print(i+","); // -> 5,4,3,2,1,0,
        }
        
        // Decrementar 3 en 3
        for (int i = 15; i >= 0; i-=3) {
            System.out.print(i+","); // -> 15,12,9,6,3,0,
        }
        
        // For nos permite crear una variable dentro o fuerda de la condicion
        for (int i = 0; i < 3; i++) {
            System.out.print(i+"-");    // -> 0-1-2
        }
        
        int j;
        for (j = 0; j < 3; j++) {
            System.out.print(j+"-");    // -> 0-1-2
        }
    }
}
