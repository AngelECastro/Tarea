package Adolecenta;
import  Mujer.Mujer;

	// EL POLIMORFISMO
public class Adolecenta extends Mujer {
    private String padre ;
    private String madre ;
    public Adolecenta(String nombre, int edad, String esposo, String padre ,String madre, String familia) {
        super(nombre, edad, esposo, familia);
        this.padre = padre ;
        this.madre = madre ;
        this.familia = familia;
        System.out.println("Nombre: " + nombre + "\n" + "Edad: " + edad + "\n" + "Esposo: " + esposo + "\n" + "Familia: " + familia + "\n" + "Padre: " + padre + "\n" +  "Madre: " + madre + "\n" + "\n" + "\n");
    }

    // GETTER Y SETTER
    public void setMadre(String madre){
        this.madre = madre;
    }
    public String getMadre(){
        return this.madre;
    }
    public void setPadre(String padre){
        this.padre = padre;
    }
    public String getPadre(){
        return this.padre;
    }
}
