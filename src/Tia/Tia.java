package Tia;
import Mujer.Mujer;

	// EL POLIMORFISMO
public class Tia extends Mujer {
    private String sobrino ;
    public Tia(String nombre, int edad, String esposo,String sobrino, String familia) {
        super(nombre, edad, esposo, familia);
        this.sobrino = sobrino ;
        this.familia = familia ;
        System.out.println("Nombre: " + nombre + "\n" + "Edad: " + edad + "\n" + "Esposo: " + esposo + "\n" + "Familia: " + familia + "\n" + "Sobrino: " + sobrino + "\n" + "\n" + "\n");
    }

    // GETTER Y SETTER
    public void setSobrino(String sobrino){
        this.sobrino = sobrino;
    }
    public String getsobrino() {
        return this.sobrino;
    }
}
