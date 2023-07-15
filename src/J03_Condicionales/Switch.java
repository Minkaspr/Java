package J03_Condicionales;

public class Switch {
    public static void main(String[] args) {
        int num1=3,num2=4,res=0;
        int parametro = 2;
        switch (parametro) {
            case 1:
                res = num1 + num2;
                System.out.println("La suma es: "+res);
                break;
            case 2:
                // Solo se ejecutará este segmento de código               
                res = num1 - num2; // -> 1
                System.out.println("La resta es: "+res);                
                break;
            case 3:
                res = num1 * num2;
                System.out.println("La multiplicacion es: "+res);
                break;
            case 4:
                res = num1 / num2;
                System.out.println("La division es: "+res);                
                break;
            default:
                System.out.println("Error, la opcion no existe");
                break;
        }
    }
}
