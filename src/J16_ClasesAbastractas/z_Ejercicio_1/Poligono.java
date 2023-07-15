package J16_ClasesAbastractas.z_Ejercicio_1;

public abstract class Poligono {
    protected int numeroLados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    @Override
    public String toString() {
        return "NumeroLados=" + numeroLados ;
    }
    
    public abstract double area();
}
