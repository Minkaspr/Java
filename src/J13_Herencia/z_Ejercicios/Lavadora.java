package J13_Herencia.z_Ejercicios;

public class Lavadora extends Electrodomestico{

    private double precio;
    private boolean aguaCaliente;
    
    public Lavadora(String marca, Double potencia){
        super ("Lavadora",marca, potencia);
        precio = 0;
        aguaCaliente = false;
    }
    
    public Lavadora(String marca, Double potencia, double precio, boolean aguaCaliente) {
        super("Lavadora", marca, potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "marca=" + getMarca() + ", potencia=" + getPotencia() +
                ", precio=" + precio + ", aguaCaliente=" + aguaCaliente + '}';
    }

    @Override
    public double getConsumo(int horas) {
        if (aguaCaliente) {
            return (getPotencia() + getPotencia() * 0.20) * horas;
        } else {
            return getPotencia() * horas;
        }
    }
    
}
