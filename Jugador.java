import java.util.ArrayList;
/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador
{
    // Atributo con el id del jugador
    public int id;
    // Atributo que guarda la cartasDelJugador del jugador
    public ArrayList<String> cartasDelJugador;
    
    /**
     * Constructor de jugadores
     */
    public Jugador(int id)
    {
      this.id = id;
      cartasDelJugador = new ArrayList<String>();
    }

    /**
     * Metodo que devuelve el id del jugador
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Metodo que agrega una carta a la cartasDelJugador del jugador
     */
    public void recibirCarta(Carta unaCarta)
    {
        cartasDelJugador.add(unaCarta.getNombre());
    }
    
    /**
     * Metodo que devuelve las cartas que tiene en la cartasDelJugador
     */
    public ArrayList<String> cartasQueTieneEnLaMano(){
        return cartasDelJugador;
    }
}
