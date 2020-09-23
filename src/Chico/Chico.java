package Chico;
import Hombre.Hombre;

	// EL POLIMORFISMO
public class Chico extends Hombre {
   private String padre ;
   private String madre ;
   public Chico(String nombre, int edad, String esposa, String padre, String madre, String familia) {
       super(nombre, edad, esposa, familia);
       this.padre = padre;
       this.madre = madre;
       System.out.println("Nombre: " + nombre + "\n" + "Edad: " + edad + "\n" + "Esposa: " + esposa + "\n" + "Familia: " + familia + "\n" + "Padre: " + padre + "\n" +  "Madre: " + madre + "\n" + "\n" + "\n");
    }
    // GETTER Y SETTER
    public void setMadre(String madre){
        this.madre = madre;
    }
    public String getMadre(){
        return this.madre;
    }
    public void setPadre(String padre){
        this.padre = padre ;
    }
    public String getPadre(){
        return this.padre;
    }


}
