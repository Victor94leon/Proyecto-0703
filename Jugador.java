import java.util.ArrayList;
public class Jugador
{
    // Guarda información sobre el número identificativo del jugador
    private int id;
    // ArrayList para guardar información sobre las cartas que posee el jugador
    private ArrayList<Carta> cartasDelJugador;
    
    /**
     * Este constructor crea un objeto jugador
     */
    public Jugador(int id)
    {
        this.id = id;
        ArrayList<Carta> cartasDelJugador = new ArrayList<Carta>();
    }
    
    /**
     * Método que devuelve el identificador del jugador
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Método que agrega la carta "unaCarta" a las que posee el jugador
     */
    public void recibirCarta(Carta unaCarta)
    {
        cartasDelJugador.add(unaCarta);
    }
    
    /**
     * Método que devuelve una colección de cadenas con los nombres de las cartas
     */
    public ArrayList<String> cartasQueTieneEnLaMano()
    {
        ArrayList<String> coleccionString = new ArrayList<String>();
        for (Carta cartaEnLista : cartasDelJugador) {
            coleccionString.add(cartaEnLista.getNombre());
        }
        return coleccionString;
    }
}
