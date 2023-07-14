package Logica;


public class Bulbasaur extends Pokemon implements iPlanta{

    public Bulbasaur() {
    }
    
    

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque paralizar");
    }
    
}
