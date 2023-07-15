package J14_Polimorfismo.z_Ejercicios;

public class Main {
    public static void main(String[] args) {
        Vehiculo misVehiculos [] = new Vehiculo[4];
        misVehiculos[0] = new Vehiculo("GA12", "Ferrari","AB1");
        
        /**
         * Polimorfismo:
         * El objeto de la clase padre (misVehiculos[]) guarde la instanciacion
         * de una de sus hijas como es la clase VehiculoTurismo
         */
        misVehiculos[1] = new VehiculoTurismo(4, "71AS","Audi", "A6");
        misVehiculos[2] = new VehiculoDeportivo(500, "ASDA15", "Toyota", "A131");
        misVehiculos[3] = new VehiculoFurgoneta(2000, "QWEQ5", "Nisaan", "4A");
        
        for (Vehiculo miVehiculo : misVehiculos) {
            System.out.println(miVehiculo.mostrarDatos());
            System.out.println("");
        }
    }
}
