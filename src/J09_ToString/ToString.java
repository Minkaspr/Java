package J09_ToString;

public class ToString {
    public static void main(String[] args) {
        /**
         * ToString
         * 
         * El método toString se utiliza para convertir un tipo de dato en su representación 
         * de cadena (String). Toma el objeto de un tipo de dato y devuelve una 
         * cadena que representa ese valor.
         * 
         * Estructura:
         *  <Objeto>.toString()
         * 
         * Ejemplo:
         *  int numero = 123;
         *  String cadena = Integer.toString(numero);
         */
        
        double peso = 3.14;
        String mensaje = Double.toString(peso);
        System.out.println("El peso es: " + mensaje);
    }
}
