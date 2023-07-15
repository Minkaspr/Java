package J13_Herencia;

public class Empleado extends Persona{
    
    int num_legajo;
    String cargo;
    Double sueldo;

    public Empleado() {
    }

    public Empleado(int num_legajo, String cargo, Double sueldo, 
            int id, String dni, String nombre, String apellidos, String domicilio, String telefono) {
        super(id, dni, nombre, apellidos, domicilio, telefono);
        this.num_legajo = num_legajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getNum_legajo() {
        return num_legajo;
    }

    public void setNum_legajo(int num_legajo) {
        this.num_legajo = num_legajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
}
