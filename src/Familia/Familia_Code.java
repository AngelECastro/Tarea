package Familia;
import Abuela.Abuela;
import Abuelo.Abuelo;
import Adolecenta.Adolecenta;
import Adolecentes.Adolecente;
import Chica.Chica;
import Chico.Chico;
import Madres.Madre;
import Padres.Padres;
import Tia.Tia;
import Tio.Tio;

abstract class Familia_Code {
    private String Apellido;
    private Padres Padre;
    private Madre Madre;
    private Adolecente Adolecentes;
    private Adolecenta Adolecentas;
    private Chico Hijos;
    private Chica Hijas;
    private Tio tio;
    private Tia tia;
    private Abuelo Abuelo;
    private Abuela Abuela;

    // GETTER Y SETTER
    public void setPadre(Padres Padre){ this.Padre = Padre; }
    public Padres getPadre(){return this.Padre;}
    public void setMadre(Madre Madre){ this.Madre = Madre; }
    public Madre getMadre(){return this.Madre;}
    public void setTio(Tio tio ){this.tio = tio; }
    public Tio getTio(){return  this.tio;}
    public void setTia(Tia tia){ this.tia = tia ;}
    public Tia getTia(){return  this.tia ; }
    public void setAbuelo(Abuelo Abuelo){ this.Abuelo = Abuelo; }
    public Abuelo getAbuelo(){ return this.Abuelo;}
    public void setAbuela(Abuela abuela ){ this.Abuela= abuela ;}
    public Abuela getAbuela(){ return this.Abuela;}
    public void setHijoPeque(Chico Hijos){ this.Hijos = Hijos;}
    public Chico getHijoPeque(){ return this.Hijos;}
    public void setHijaPeque(Chica Hijas){ this.Hijas = Hijas;}
    public Chica getHijaPeque(){return this.Hijas;}
    public void setHijoAdolecente(Adolecente Adolecentes) { this.Adolecentes = Adolecentes;}
    public Adolecente getHijoAdolecente(){return this.Adolecentes;}
    public void  setHijaAdolecente(Adolecenta Adolecentas){ this.Adolecentas= Adolecentas;}
    public Adolecenta getHijaAdolecente(){ return this.Adolecentas;}

    public void setApellido( String Apellido){ this.Apellido= Apellido; }
    public String getApellido(){ return this.Apellido;}
}
