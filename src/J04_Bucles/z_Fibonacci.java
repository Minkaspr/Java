package J04_Bucles;

public class z_Fibonacci {
    public static void main(String[] args) {
        
        /**
         * Sucecion Fibonacci
         *  0,1,1,2,3,5,8,13,21,34
         */
        int i=0, a=0, b=1, c=0;
        
        System.out.println("Serie con For:");
        for (i = 0; i < 10; i++) {
            if (i < 9) {
                System.out.print(a+",");
                c = a + b;
                a = b;
                b = c;
            } else {
                System.out.println(a);
            }
        }
        // Serie con For:
        // 0,1,1,2,3,5,8,13,21,34
        
        System.out.println("Serie con While");
        i=0; a=0; b=1; c=0;
        while (i < 10) {            
            if (i < 9) {
                System.out.print(a+",");
                c = a + b;
                a = b;
                b = c;
            } else {
                System.out.println(a);
            }
            i++;
        }
        // Serie con While:
        // 0,1,1,2,3,5,8,13,21,34
        
        System.out.println("Serie con Do While");
        i=0; a=0; b=1; c=0;

        do {            
            if (i < 9) {
                System.out.print(a+",");
                c = a + b;
                a = b;
                b = c;
            } else {
                System.out.println(a);
            }
            i++;    
        } while (i<10);
        // Serie con While:
        // 0,1,1,2,3,5,8,13,21,34
    }
}
