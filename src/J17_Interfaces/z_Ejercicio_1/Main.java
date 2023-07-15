package J17_Interfaces.z_Ejercicio_1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Detergente det1 = new Detergente("Sapolio", 12);
        det1.setVolumen(300);
        det1.setDescuento(0.02);
        det1.setTipoEnvase("Botella retornable");
        System.out.println(det1);
        
        
        Cereales cel1 = new Cereales("Lays", "Espelta",8);
        cel1.setCaducidad(LocalDate.of(2023, 8, 2));
        
        System.out.println(cel1);
        
        
        Vino v1 = new Vino("Borgoña", "tinto", 12, 19);
        v1.setVolumen(1000);
        v1.setTipoEnvase("botella de cristal");
        v1.setCaducidad(LocalDate.of(2023,7, 12));
        v1.setDescuento(5.0);
        System.out.println(v1);
        
        // POLIMORFISMO 
        ArrayList<EsAlimento> lista = new ArrayList<>();
        lista.add(v1);
        lista.add(cel1);
        
        // Calcular el total de calorias de todos los objetos que estan dentro de la 'lista'
        int totalCalorias = 0;
        for (EsAlimento alimento : lista) {
            totalCalorias += alimento.getCalorias();
        }
        System.out.println("Total Calorias: "+totalCalorias);
    }
}
