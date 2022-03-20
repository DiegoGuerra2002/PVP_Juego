package pvp;

import java.util.Random;

/**
 *
 * @author Diego Fernando Guevara Guerra
 */
public class Computadora extends Personaje{
    private int vidaTotal;
    
    public Computadora()
    {
        super("Computadora", 25,30,10,0.5, "Beep");
        this.vidaTotal = super.getSalud();
    }
    
    public void aumentarDefensa()
    {
        Random r = new Random();
        int a = r.nextInt(200);
        if(a>150&&((double)super.getSalud()/(double) this.vidaTotal)<=0.20)
        {
            int defensa = super.getDefensa();
            defensa += 5;
            super.setDefensa(defensa);
            System.out.println("Consegui un antivirus nuevo... Ahora soy imparable"); 
        }
    }
    
}
