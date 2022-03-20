package pvp;

import java.util.Random;

public class Caballero extends Personaje{
    public Caballero()
    {
        super("Caballero",125,20,35,0.6,"Corte con espada");
    }
    public void aumentoAtaque()
    {
        Random r = new Random();
        int a = r.nextInt(200);
        if (a>100&&a<150&&this.getSalud()<=50)
        {
            int ataque = this.getAtaque();
            ataque+=3;
            this.setAtaque(ataque);
            
            System.out.println("Pobre iluso... Creisteis que me habiais derrotado");
            System.out.println("Tus debiles ataques solo habeis logrado que aumente mi poder");
        }
    }
}
