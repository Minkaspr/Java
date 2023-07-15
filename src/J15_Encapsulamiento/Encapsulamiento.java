package J15_Encapsulamiento;

public class Encapsulamiento {
    /**
     * Encapsulamiento:
     *  Significa reunir a todos los elementos que pueden considerarse pertenecientes
     *  a una misma entidad, al mismo nivel de abstraccion. No se debe confundir
     *  con el Principio de Ocultación.
     * 
     * Principio de Ocultación:
     *  Cada objeto está aislado y únicamente expone una interfaz a otros objetos
     *  donde espeficica cómo pueden interactuar con él. El aislamiento protege a las
     *  propiedades de un objeto contra su modificación por quien no tenga derecho
     *  a acceder a ellas.
     * 
     * Niveles de Encapsulamiento:
     *  > PUBLIC (Público)
     *      Todo atributo o metodo que tenga public delante puede ser utilizado
     *      desde cualquier clase, cualquier posicion que estemos dentro de la
     *      aplicacion.
     *  > PRIVATE (Privado)
     *      Todo atributo o metodo que tenga private delante, puede ser utilizado
     *      unicamente dentro de la clase donde está declarado. 
     *  > PROTECTED (Protegido)
     *      Todo atributo o metodo que tenga protected delante, establece que el
     *      acceso solamente pueden ser utilizados ademas dentro de la misma clase
     *      tambien en sus clases hijas cuando apliquemos herencia.
     *  
     * Miembros Estáticos de una clase
     *  > Atributos Estáticos
     *      El atributo deja de pertenecer a un objeto y pertenece a la clase.
     *      Todo cambio que se haga al atributo sin importar en que objeto se encuentre
     *      Repercute y será el cambio definitivo para todos los objetos.
     *      
     *      private static String frase ="Primera fase";
     *      
     *      Para llamarlo ya no se requiere de un objeto
     *      System.out.println(Encapsulamiento.frase);
     * 
     *  > Métodos Estáticos
     *      El metodo deja de pertenecer a un objeto y pertenece a la clase.
     *      
     *      public static int sumar (int n1, int n2){
     *          return n1 + n2;  
     *      }
     * 
     *      Para llamar el metodo de la clase
     *      System.out.println(Encapsulamiento.sumar(3,4)); // -> 7
     * 
     */
    public static void main(String[] args) {
        
        Alumno alu = new Alumno();
        Alumno alu2 = new Alumno(15, "Min", "Kasper");
        
        System.out.println("Id: "+alu2.getId());
        System.out.println("Nombre: "+alu2.getNombre());
        System.out.println("Apellido: "+alu2.getApellido());
    }
}
