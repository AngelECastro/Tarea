package Madres;
import Mujer.Mujer;

	// EL POLIMORFISMO
public class Madre extends Mujer {
    private  String hijos ;
    private  String esposo ;
    public Madre(String nombre, int edad,String hijos,  String esposo,  String familia) {
        super(nombre, edad, esposo, familia);
        this.hijos = hijos ;
        this.esposo = esposo ;
        this.familia = familia ;
        System.out.println("Nombre: " + nombre + "\n" + "Edad: " + edad + "\n" + "Esposo: " + esposo + "\n" + "Familia: " + familia + "\n" + "hijos " + hijos + "\n" + "\n" + "\n");
    }

    // GETTER Y SETTER
    public void setEsposo( String esposo){
        this.esposo = esposo;
    }
    public String getEsposo() {
        return esposo;
    }
    public void setHijos(String hijos){
        this.hijos = hijos;
    }
    public String getHijos(){
        return  hijos;
    }
    public  void setFamilia(String familia){ this.familia = familia;}
    public  String getFamilia(){ return this.familia;}


}
