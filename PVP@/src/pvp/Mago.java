
package pvp;

import java.util.Random;

public class Mago extends Personaje{
    public Mago()
    {
        super("Mago",75,40,20,0.7,"hechizo");//Llamado de metodo constructor con parametros
        
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
            System.out.println("Mi hechizo ha funcionado... Estoy mas fuerte");
            System.out.println("Mago: Cur interpretaris");
            System.out.println("Mago: Mi hechizo ha funcionado... Estoy mas fuerte");
        }
    }

    @Override
    public void ganador() {
        System.out.println("Mago: Mi hechizos fueron los mas fuertes, asi que te venci");
    }
}
