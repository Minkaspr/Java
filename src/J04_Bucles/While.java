
package J04_Bucles;


public class While {
    public static void main(String[] args) {
        
        /**
         * While
         * 
         * while(<condicion>){
         *      <instrucciones>
         * }
         * 
         * Nota: No permite declarar la variable dentro de la condicion
         */
        
        // Incrementar 1 en 1
        int i = 1;
        while(i<10) {
            System.out.print(i+",");    // -> 1,2,3,4,5,6,7,8,9
            i++;
        }
        
        // Decrementar 2 en 2
        int j = 15;
        while(j>1) {
            System.out.print(j+",");    // -> 15,13,11,9,7,5,3
            j-=2;
        }
        
    }
    
}
