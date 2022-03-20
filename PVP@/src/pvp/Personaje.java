package pvp;

/**
 *
 * @author Agustin
 */
public class Personaje {
    private String nombre = "COMPUTADORA";
    private int salud = 200;
    private int ataque = 30;
    private int defensa = 20;
    private double ta = 0.5;
    private String tipoA = "electrocargado";
    
    public Personaje (String _nombre, int _salud, int _ataque, int _defensa, double _ta, String _tipo)
    {
    nombre = "COMPUTADORA";
    salud = 200;
    ataque = 30;
    defensa = 20;
    ta = 0.5;
    tipoA = "electrocargado";
    }

    public String getNombre()
    {
        return this.nombre;
    }
    
    public void setNombre(String _nombre)
    {
        this.nombre=_nombre;
    }
    
    public int getSalud()
    {
        return this.salud;
    }
    
    public void setSalud (int _salud)
    {
        this.salud= _salud;
    }
    
    public int getAtaque()
    {
        return this.ataque;
    }
    
    public int setDefensa () 
    {
        return this.defensa;
    }
    
    public void getDefensa (int _defensa)
    {
        this.defensa= _defensa;
    }
    
    public double getTa()
    {
        return this.ta;
    }
    
    public void setTa(double _ta)
    {
        this.ta= _ta;
    }
    
    public String getTipoA()
    {
        return this.tipoA;
    }
    
    public void setAtaque (int _ataque)
    {
        this.ataque= _ataque;
    }
   public void Atacado(int _ataque, String _tipo)
   {
       int daño = _ataque-this.defensa;
       int vidaRestante=this.salud;
       if(daño>0)
       {
         vidaRestante=daño;
         System.out.println(this.nombre+" RECIBIO UN "+ _tipo +"IMPACTO . . . - "+daño+" puntos de vida");
       }else {
          System.out.println(this.nombre+" RECIBIO UN "+ _tipo+ "GOLPE DEBIL . . . jeje");          
       }
       this.salud = vidaRestante;
       System.out.println(this.nombre+" tiene"+ this.salud+" puntos de vida restante");
   }
   
    
    
    public void Esquivar()
    {
        System.out.println(this.nombre+" logro esquivar el golpe. . . Miss");
    }
    
    //Este metodo devuelve verdadero si el personaje sigue con vida
    public boolean Estado()
    {
        boolean vida = true;
        if(this.salud<=0) vida=false;
        return vida;
    }

    int getDefensa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setDefensa(int defensa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
