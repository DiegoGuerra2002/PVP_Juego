/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pvp;

import java.util.Random;

public class Guerrero extends Personaje{
    public Guerrero()
    {
        super("Guerrero",100,30,30,0.8,"combo de golpes");
    }
    
    public void aumentoDefensa()
    {
        Random r = new Random();
        int a = r.nextInt(200);
        if(a>100 && a<135)
        {
            int defensa = this.getDefensa();
            defensa+=1;
            this.setDefensa(defensa);
            double ta = this.getTa();
            ta-=0.02;
            this.setTa(ta);
            System.out.println("Mis habilidades han mejorado... Ya no me podras golpear facilmente");
            System.out.println("Guerrero: Mis habilidades han mejorado... Ya no me podras golpear facilmente");
        }
    }

    @Override
    public void ganador() {
        System.out.println("Guerrero: Ha ganado el mas certero");
    }
}
