package J15_Encapsulamiento.z_Ejercicio_1;

public class Cuadrilatero {
    
    // Atributos
    private float lado1;
    private float lado2;
    
    // Método Constructor
    public Cuadrilatero(float lado1, float lado2) {
        // Para cualquier cuadrilatero
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Cuadrilatero(float lado1) {
        // Para el cuadrilatero 'cuadrado'
        this.lado1 = this.lado2 = lado1;
    }
    
    // Métodos
    public float getPerimetro(){
        float perimetro = 2*(lado1+lado2);
        return perimetro;
    }
    
    public float getArea(){
        float area = lado1 * lado2;
        return area;
    }
    
}
