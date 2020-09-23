package Abuelo;
import Hombre.Hombre;

	// EL POLIMORFISMO
public class Abuelo extends Hombre {
    private String nieto;
    private String hijo;
    public Abuelo(String nombre, int edad, String esposa, String familia ,String nietos , String hijos) {
        super(nombre, edad, esposa, familia);
        this.nieto = nietos;
        this.hijo = hijos;
        this.familia = familia;
        System.out.println("Nombre: " + nombre + "\n" + "Edad: " + edad + "\n" + "Esposa: " + esposa + "\n" + "Familia: " + familia + "\n" + "Nieto: " + nietos + "\n" +  "Hijo: " + hijos + "\n" + "\n" + "\n");
    }
    // GETTER Y SETTER
    public void setNieto(String nieto){this.nieto = nieto;}
    public String getNieto(){return this.nieto;}

    public void setHijo(String hijo){this.hijo = hijo;}
    public String getHijo(){return this.hijo;}

}
