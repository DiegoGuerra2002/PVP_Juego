package pvp;

import java.util.Random;

public class Caballero extends Personaje{
    public Caballero()
    {
        super("Caballero",125,20,35,0.6,"corte con espada");
    }
    
    public void aumentoAtaque()
    {
        Random r = new Random();
        int a = r.nextInt(200);
        if(a>100&&a<150&&this.getSalud()<=50)
        {
            int ataque = this.getAtaque();
            ataque+=3;
            this.setAtaque(ataque);
            
            System.out.println("Pobre iluso... Creisteis que me habiais derrotado");
            System.out.println("Con tus debiles ataques solo habeis logrado que aumente mi poder");
        }
    }
    
    public void bajarDefensa()
    {
        Random r = new Random();
        int a = r.nextInt(200);
        if(a>100 && this.getSalud()>100)
        {
            int defensa = this.getDefensa();
            defensa-=3;
            this.setDefensa(defensa);
            System.out.println("Desgraciado!! Me habeis dañado la armadura");
            System.out.println("Pagarais por ello");
            System.out.println("Caballero: Desgraciado!! Me habeis dañado la armadura");
            System.out.println("Caballero: Pagarais por ello");
        }
    }

    @Override
    public void ganador() {
        System.out.println("Caballero: Al subestimarme perdiste");
    }

}
