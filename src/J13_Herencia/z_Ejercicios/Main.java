package J13_Herencia.z_Ejercicios;

public class Main {
    public static void main(String[] args) {
        
        Electrodomestico el = new Electrodomestico("nevera", "elpolo", 0.50);
        el.setPotencia(0.63);
        el.setMarca("Indurama");
        System.out.println(el);
        int horas = 10;
        double precioKwh=0.5;
        double coste = el.getCosteConsumo(horas, precioKwh);
        double consumo = el.getConsumo(horas);
        System.out.println("El consumo del electrodomestico es: " + consumo + "kW en "+ horas + "h");
        System.out.println("El costo del consumo es: S/" + coste);
        
        // -------------------------------------------------------
        Lavadora ld = new Lavadora("Samsung", 0.5, 400, false);
        System.out.println(ld);
        ld.setAguaCaliente(true);
        System.out.println("El consumo de la lavadora en 10 horas: "+ ld.getConsumo(10));
        System.out.println("El coste del consumo en 10 horas: "+ld.getCosteConsumo(10, 2));
    }
}
