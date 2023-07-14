package Logica;


public class EjercicioIntegrado {
    
    public static void main(String[] args) {
        
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulba = new Bulbasaur();
        Pikachu pika = new Pikachu();
        
        squirtle.atacarAraniazo();
        squirtle.atacarHidrobomba();
        charmander.atacarAraniazo();
        charmander.atacarLanzallamas();
        bulba.atacarAraniazo();
        bulba.atacarDrenaje();
        pika.atacarAraniazo();
        pika.atacarImpacTrueno();
        
    }
}
