
package pvp;

import java.util.Random;

public class Mago extends Personaje{
    public Mago()
    {
        super("Mago",75,40,20,0.7,"hechizo");
        
    }
    public void aumentarSalud()
    {
        Random r = new Random();
        int a = r.nextInt(200);
        if(a<50&&((double) super.getSalud()/75.0)<0.5)
        {
            int salud = this.getSalud();
            salud += 8;
            super.setSalud(salud);
            System.out.println("Cur interpretaris");
            System.out.println("Mi hechizo ha funcionado.... me he recuperado!");            
        }
    }
}
