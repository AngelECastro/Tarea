package Tio;
import Hombre.Hombre;

	// EL POLIMORFISMO
public class Tio extends Hombre{
    private String sobrino;
    public Tio(String nombre, int edad, String esposa, String sobrino ,String familia) {
        super(nombre, edad, esposa, familia);
        this.sobrino = sobrino ;
        System.out.println("Nombre: " + nombre + "\n" + "Edad: " + edad + "\n" + "Esposo: " + esposa + "\n" + "Familia: " + familia + "\n" + "Sobrino: " + sobrino + "\n" + "\n" + "\n");
    }

    // GETTER Y SETTER
    public void setSobrino(String sobrino){
        this.sobrino = sobrino;
    }
    public String getsobrino() {
        return this.sobrino;
    }
}
