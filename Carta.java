/**
 * Write a description of class Carta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carta
{
    // Atributo para guardar el valor de la carta
    public int valor;
    // Atributo para guardar el palo de la carta
    public String palo;
    
    /**
     * Constructor de objetos carta, pasamos por parametro el valor de la carta[1..13] y el palo[Picas, Diamantes, Corazones, Treboles].
     */
    public Carta(int valor, String palo)
    {
        this.valor = valor;
        this.palo = palo;
    }
    
    /**
     * Metodo que devolvera el nombre completo de la carta.
     */
    public String getNombre()
    {
        return valor + " de " + palo;
    }
    
    /**
     * Metodo que devolvera el valor de la carta
     */
    public int getValor()
    {
        return valor;
    }
    
    /**
     * Metodo que devolvera el palo de la carta
     */
    public String getPalo()
    {
        return palo;
    }
}
