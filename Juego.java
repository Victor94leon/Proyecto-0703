import java.util.ArrayList;
public class Juego
{
    // ArrayList para guardar información sobre los jugadores que hay
    private ArrayList<Jugador> jugadores;
    // Objeto de tipo Mazo para guardar información sobre el mazo
    private Mazo mazo;

    /**
     * Constructor que crea un objeto Juego, el cual crea el numero de jugadores indicados y crea el mazo.
     * Si el número de jugadores no es válido se crea un juego con 4 jugadores por defecto.
     */
    public Juego(int numeroJugadores)
    {
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();    
        mazo = new Mazo();
        mazo.barajar();
        int index = 1;  
        if (numeroJugadores<0 || numeroJugadores>8) {
            while (index<=4) {
                Jugador nuevoJugador = new Jugador(index);
                jugadores.add(nuevoJugador);
                index++;
            }
        }
        else {
            while (index<=numeroJugadores) {
                Jugador nuevoJugador = new  Jugador(index);
                jugadores.add(nuevoJugador);
                index++;
            }
        }
    }

    /**
     * Método que reparte todas las cartas a los jugadores en la forma habitual en que se hace en un juego de cartas, 
     * es decir, barajando el mazo y entregando alternativamente cartas a los jugadores tomando siempre la primera 
     * carta del mazo. Al finalizar el reparto todos los jugadores deben tener el mismo número de cartas, por lo que 
     * es posible, dependiendo del número de estos, que queden cartas en el mazo.
     */
    public void repartir()
    {
            if ((mazo.quedan()%jugadores.size())== 0) {
            while (mazo.quedan()!=0) {
                for (Jugador jugadorEnLista : jugadores) {
                    jugadorEnLista.recibirCarta(mazo.tomarPrimera());
                }
            }
        }
        else {
            while (mazo.quedan()!= mazo.quedan()%jugadores.size()) {
                for (Jugador jugadorEnLista : jugadores) {
                    jugadorEnLista.recibirCarta(mazo.tomarPrimera());
                }
            }
        }
    }

    /**
     * Método que muestra por pantalla el id de cada jugador junto a las cartas que tiene en la mano.
     */
    public void mostrarCartasJugadores()
    {
        for (Jugador jugadorEnLista : jugadores) {
            System.out.println("Jugador: " + jugadorEnLista.getId());
            System.out.println("Mano: " + jugadorEnLista.cartasQueTieneEnLaMano());
        }
    }
}
