package J18_Interface_Abstract;

public class Pikachu extends Pokemon implements iElectrico{

    public Pikachu() {
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Pikachu y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Pikachu y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Pikachu y este es mi ataque mordisco");
    }

    @Override
    public void atacarImpacTrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque impacTrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque puñoTrueno");
    }
    
}
