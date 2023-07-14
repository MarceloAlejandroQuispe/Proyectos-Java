
package Logica;

public class Squirtle extends Pokemon implements iAgua {

    public Squirtle() {
    }
    
    

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Squirtle y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Squirtle y este es mi ataque placaje");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Squirtle y este es mi ataque placaje");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola soy Squirtle y este es mi ataque hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Squirtle y este es mi ataque burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
