package J03_Condicionales;

public class If_Else {
    public static void main(String[] args) {
        /**
         * Condicional If - Else
         * 
         * Bajo una condicion, tenemos 2 opciones, una verdadera y una falsa
         */
        
        int matematicas = 5;
        int biologia = 8;
        int quimica = 7;
        int promedio = 0;
        
        promedio = (matematicas + biologia + quimica )/3; // -> 6
        // Realizamos la condicional
        if (promedio >= 6){
            System.out.println("El alumno aprobó con: "+promedio); // <- 
        } else {
            System.out.println("El alumno reprobó con: "+promedio);
        }
    }
}
