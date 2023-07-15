package J12_Clases;

public class Alumno {
    /**
     * Esta es una clase 'Alumno'
     * Las clases siempre se inicia con letra mayuscula el primer caracter
     */
    
    /**
     * Atributos
     */
    // Variables Globales
    int id;
    String nombre;
    String apellido;
    
    /**
     * Constructores
     */
    
    public Alumno() {
        // Constructor vacío
    }
    
    public Alumno(int id, String nombre, String apellido) {
        // El 'this' hace referencia a la variable global declarada para esta clase
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    /**
     * Getter && Setter
     * Por cada atributo hay un getter y setter
     * 
     * Get - Traer
     * Set - Colocar
     */

    public int getId() {
        // Retorna el 'id'
        return id;
    }

    public void setId(int id) {
        // Recibe y asigna el 'id'
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
    /**
     * Métodos
     * 
     * Estructura: <ModificadorAcceso> <TipoDato> <nombreInfinitivo>(){}
     */
    public void mostrarNombre(){
        System.out.println("Hola, soy un alumno y se decir mi nombre");
    }
    
}
