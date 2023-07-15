package J13_Herencia.z_Ejercicios;

public class Electrodomestico {
    private String tipo;
    private String marca;
    private Double potencia;

    public Electrodomestico(String tipo, String marca, Double potencia) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPotencia() {
        return potencia;
    }

    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "tipo=" + tipo + ", marca=" + marca + ", potencia=" + potencia + "kW"+'}';
    }
    
    public double getConsumo(int horas){
        return potencia * horas;
    }
    
    public double getCosteConsumo(int horas, double costeHora){
        return getConsumo(horas) * costeHora;
    }
}
