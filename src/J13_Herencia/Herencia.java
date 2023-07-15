package J13_Herencia;

public class Herencia {
    /**
     * Herencia
     * 
     *  El mecanismo conocido con el nombre de herencia permite reutilizar clases:
     *  Se crea una nueva clase que extiende la funcionalidad de una clase existente
     *  sin tener que reescribir el código asociado a esta última.
     *  La nueva clase, a la que se denomina 'subclase', puede poseer atributos y
     *  métodos que no existan en la clase original.
     *  Los objetos de la nueva clase 'heredan los atributos y los métodos de la 
     *  clase original, que se denominan 'superclase'.
     * 
     * 
     *  Ejemplo:
     *      Persona:
     *          Es una clase genérica que sirve para almacenar datos en común de
     *          todas las personas, como el nombre, dirección, etc.
     *      Empleado:
     *          Es una clase que hereda estos mismos atributos de la clase Persona,
     *          pero puede incluir atributos propios, como el puesto, cargo, etc.
     *      Consultor:
     *          Es una clase que hereda los mismos atributos en común de la clase
     *          Persona, mientras que puede incluir atributos propios, como id del
     *          consultor, nombre de la empresa consultora, etc.
     */
    
    public static void main(String[] args) {
        
        Empleado emp = new Empleado();
        emp.getNum_legajo();
        emp.getNombre();
        
        
        Consultor con = new Consultor();
        con.getNum_consultor();
        con.getNombre();
    }
}
