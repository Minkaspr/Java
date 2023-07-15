package J16_ClasesAbastractas;

public class ClaseAbstracta {
    /**
     * Clases Abstractas
     * 
     * Son un tipo particular de clase cuya principal características es que
     * no pueden ser instanciadas.
     * Generalmente 'declara la existencia de métodos pero no su implementación'
     * convirtiéndola así en una clase padre.
     * Al menos uno de sus métodos debe ser abstracto (puede tener métodos no 
     * abstractos).
     * Sus niveles de visualizacón deben ser o 'public o pretected' (nunca private)
     * Cuando se usan clases abstractas una clase no puede heredar de varias
     * clases abstractas a la vez (como es en el caso de las interfaces).
     * Generalmente las clases abstractas indican el "Es/Ser" de un objeto.
     * 
     *  ¿Cuándo se usan las clases abstractas?
     *  Cuando deseamos definir una abstracción que englobe objetos de distintos
     *  tipos y queremos hacer uso del polimorfismo.
     * 
     *  Ejemplo:
     *      Figura es una clase abstracta porque no tiene sentido calcular su
     *      área, pero sí la de sus hijos (cuadrado o círculo).
     *      Si una subclase de Figura (cuadrado o círculo) no redefine el método
     *      calcularArea(), deberá declararse también como clase abstracta.
     * 
     *  Clase abstracta: 
     *      Figura, con atributos: posicionX, posicionY y método calcularArea()
     *  SubClases:
     *      Circulo, con atributos: posicionX, posicionY, radio y método calcularArea()
     *      Cuadrado, con atributos: posicionX, posicionY, lado y método calcularArea()
     * 
     */
    
    public static void main(String[] args) {
        
    }
}
