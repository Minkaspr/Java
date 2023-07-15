package J14_Polimorfismo;
    /**
     *  Overload -> Polimorfismo con respuesta de acuerdo a los parámetros
     *      pudiendo agregar o quitar parámetros
     *  Override -> Polimorfismo sobre escribiendo los métodos heredados tal cual
     */
public class Polimorfismo {
    /**
     * Polimorfismo
     * 
     *      Poli <> Muchas
     *      Morfismo <> Formas
     * 
     *  Es una relacion de tipo Herencia, un objeto de la superclase puede almacenar
     *  un objeto de cualquiera de sus subclases.
     *  Esto significa que la clase padre o superclase es compatible con los tipos
     *  que derivan de ella, pero no al revés.
     * 
     *  Facilita la flexibilidad y reutilización de código al ejecutar la 
     *  implementación especifica de cada subclase a través
     * 
     *      Clase Padre:    Vehiculo
     *      Clases Hijas:   Coche, Moto, Bus    (Hijas o Derivadas)
     * 
     *      Declaro la función:
     *          function estacionar(vehiculo){}
     *      Invoco la función: (soporto polimorfismo)
     *          estacionar(Coche);
     *          estacionar(Moto);
     *          estacionar(Bus);
     * 
     * 
     *  Planteamos el ejercicio:
     *      Queremos guardar en un vector a personas tanto empleados, jefes como consultores
     * 
     */
    public static void main(String[] args) {
        
        // Nos da un error porque el vector es String y se le quiere guardar un entero
        //  String vector [] = new String [3];
        //  vector [0] = 1;
        
        // Implementando polimorfismo en un objeto
        Persona vector[] = new Persona[3];
        vector[0] = new Persona();
        vector[1] = new Empleado();
        vector[2] = new Consultor();
        vector[3] = new Jefe();
        
        /**
         * El vector es de tipo Persona.
         * Como persona es la clase madre y empleado, consultor y jefe las clases hijas
         * y son fomras diferentes de representar una misma persona, este me permite
         * que en un vector que pertenezca a la clase padre yo pueda guardar distintas
         * tipos que pertenezcan a las clases hijas
         */
        
        // Instanciamos objetos perso y consul
        Persona perso = new Persona();
        Consultor consul = new Consultor();
        perso = consul;
        /**
         * Como consultor es una clase hija de la clase persona, por polimorfismo
         * se puede hacer este tipo de asignaciones.
         * solo cuando se asigna un objeto hijo al objeto padre
         * 
         * Daria error si fuese alrevez, de padre a su hijo
         *  consul = perso; <- Error ->
         */
        
        
        
    }
}
