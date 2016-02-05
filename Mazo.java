import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class Mazo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mazo
{
    // Atributo que guarda las cartas de un mazo
    ArrayList<Carta> mazo;

    /**
     * Constructor de objetos mazo.
     */
    public Mazo()
    {
        mazo = new ArrayList<Carta>();
        // Metodo para introducir las cartas en el mazo de manera automatica, sin tener que ir
        // uno por uno manualmente.
        int i = 1;
        int z = 1;
        while(i < 5)
        {
            while(z<14)
            {
                if(i == 1)
                {
                    mazo.add(new Carta(z, "Picas"));
                }
                else
                {
                    if(i == 2)
                    {
                        mazo.add(new Carta(z, "Corazones"));
                    }
                    else
                    {
                        if(i == 3)
                        {
                            mazo.add(new Carta(z, "Diamantes"));
                        }
                        else
                        {
                            mazo.add(new Carta(z, "Treboles"));
                        }
                    }
                }
                z ++;
            }
            z = 1;
            i++;
        }
    }

    /**
     * Metodo que baraja todas las cartas del mazo
     */
    public void barajar()
    {
        Collections.shuffle(mazo);
    }

    /**
     * Metodo que coge la primera carta, nos la devuelve, y la elimina del mazo
     */
    public Carta tomarPrimera()
    {
        Carta primeraCarta = null;
        if(mazo.size() != 0)
        {
            primeraCarta = mazo.get(0);
            mazo.remove(0);
        }
        return primeraCarta;
    }

    /**
     * Metodo para devolver el numero de cartas que quedan en el mazo
     */
    public int quedan(){
        return mazo.size();
    }
}
