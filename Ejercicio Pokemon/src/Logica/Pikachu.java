
package Logica;


public class Pikachu extends Pokemon implements iEletrico {

    public Pikachu() {
    }
    
    

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Pikachu y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Pikachu y este es mi ataque araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Pikachu y este es mi ataque mordisco");
    }

    @Override
    public void atacarImpacTrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque  impact trueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque punio trueno");
    }
    
}
