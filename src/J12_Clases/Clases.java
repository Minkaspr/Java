package J12_Clases;

public class Clases {
    /**
     *  Clase
     *      Es una plantilla, o molde que permite construir objetos.
     *      Ejemplo: 
     *          Si tuvieramos la clase Auto, esta seria el plano para construir el objeto.
     *      Representan "entidades" del mundo real.
     *      Poseen atributos y métodos
     *      No pueden ser utilizadas directamente (sino mediante instancias a objetos).
     *      Ejemplos:
     *          Auto, Persona, Departamento, Producto, etc.
     *  Métodos
     *      Las operaciones o métodos son acciones contenidas en una clase y definen 
     *      su comportamiento.
     *      Dentro de un sistema, las operaciones suelen detectarse como verbos.
     *      Desde la perspectiva de Diseño y Programacion, se denominan 'Métodos'.
     *      Desde la perspectiva de Analiss, se denominan 'Operaciones'
     *      Puede tener opcionalmente 'valores de entrada' (Parámetros) y 
     *      'valores de salidad' (Valores de Retorno).
     *      Pueden existir 'Procedimientos' (no retornan un valor) y 
     *      'Funciones' (retornan un valor).
     *      
     *  Objetos
     *      Un objeto es una la instancia de una clase.
     *      Es la representación de un objeto que generalmente existe en la vida real.
     *      Posee un estado (de acuerdo a sus atributos).
     *      Posee un comportamiento (realizan operaciones de acuerdo a sus metodos)
     * 
     *      Clase alumno <--------------->Alumno Mario, Alumno Juan (Objetos)
     * 
     *  < Métodos Especiales >
     *  Constructor
     *      Son funciones especiales que contienen las clases para 
     *      'permitir la creacion de objetos'
     *      Pueden recibir datos/parámetros como no (constructor vacío)
     *      Se llaman SIEMPRE igual que la clase.
     *      No retorna NINGUN VALOR (ni siquiera VOID)
     *      Generalmente se utilizan dos tipos de constructores
     *          - Constructor Vacio
     *          - Constructor con todos los parámetros
     *  Getter
     *      Es un método utilizado en la programación orientada a objetos para 
     *      acceder y obtener el valor de un atributo privado de una clase. 
     *      Proporciona acceso controlado a los datos encapsulados al devolver el
     *      valor del atributo deseado.
     * 
     *  Setter
     *      Es un método utilizado en la programación orientada a objetos para 
     *      establecer o modificar el valor de un atributo privado de una clase. 
     *      Proporciona acceso controlado a los datos encapsulados al permitir la 
     *      asignación de un nuevo valor al atributo.
     * 
     */
    
    
    public static void main(String[] args) {
        
        // Creamos un objeto alum1 vacio
        Alumno alum1 = new Alumno();
        // Creamos un objeto alum2 con valores
        Alumno alum2 = new Alumno(5, "Min", "Kasper");
        
        // Usando el objeto alum2 con valores y get (recibir)
        System.out.println("La id del alumno 2 es: " + alum2.getId());
        System.out.println("El nombre es: "+alum2.getNombre());
        System.out.println("El apellido es: "+alum2.getApellido());
        
        System.out.println("\n-------------------\n");
        // Usando el objeto alum1 sin valores y set (enviar)
        alum1.setId(8);
        alum1.setNombre("Dario");
        alum1.setApellido("Quispe");
        // Usando el objeto alum1 con valores y get (recibir)
        System.out.println("La id del alumno 2 es: " + alum1.getId());
        System.out.println("El nombre es: "+alum1.getNombre());
        System.out.println("El apellido es: "+alum1.getApellido());
        
        System.out.println("\n-------------------\n");
        
        // Modificar el atributo id del objeto alum2
        alum2.setId(35);
        // Mostramos los datos actualizados el objeto alum2
        System.out.println("La id del alumno 2 es: " + alum2.getId());
        System.out.println("El nombre es: "+alum2.getNombre());
        System.out.println("El apellido es: "+alum2.getApellido());
    }
}
