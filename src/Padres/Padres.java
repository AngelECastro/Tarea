package Padres;

import Hombre.Hombre;

	// EL POLIMORFISMO
public class Padres extends Hombre {
    private  String hijos ;
    private  String esposa ;

    public Padres(String nombre, int edad, String hijos, String esposa, String familia) {
        super(nombre, edad, esposa, familia);
        this.hijos = hijos ;
        this.esposa = esposa ;
    }
    
    // GETTER Y SETTER
    public void setEsposa( String esposa){
        this.esposa = esposa ;
    }
    public String getEsposa() {
        return esposa;
    }
    public void setHijos(String hijos ){
        this.hijos = hijos ;
    }
    public String getHijos(){
        return  hijos ;
    }
}
