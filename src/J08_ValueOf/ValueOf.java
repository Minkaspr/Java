package J08_ValueOf;

public class ValueOf {

    public static void main(String[] args) {
        /**
         * ValueOf
         *
         * El método valueOf se utiliza para convertir una cadena o cualquier
         * otro tipo de dato en un objeto del tipo correspondiente. Toma una
         * cadena como entrada y devuelve un objeto envoltorio (wrapper) del
         * tipo de dato correspondiente.
         *
         * Estructura:
         * <TipoDeDato>.valueOf(<VariableString>)
         *
         * Ejemplo: Integer numero = Integer.valueOf("123"); En este caso, se
         * convierte la cadena "123" en un objeto Integer y se asigna a la
         * variable numero.
         *
         * Al ser de uso general la estructura detallada seria:
         * <TipoDeDato>.valueOf(<Argumento>)
         *
         * <TipoDeDato> representa el tipo de dato al que se desea convertir, y
         * <Argumento> es el valor o la cadena que se va a convertir en un
         * objeto del tipo correspondiente.
         */

        // Convertir un double a string
        double valor1 = 3.1416;
        String cadena1 = Double.toString(valor1);
        
        double valor2 = 3.1416;
        String cadena2 = String.valueOf(valor2);
        
        Double valor3 = 3.1416;
        String cadena3 = String.valueOf(valor3);
    }
}
