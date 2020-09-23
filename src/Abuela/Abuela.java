package Abuela;
import Mujer.Mujer;

	// EL POLIMORFISMO
public class Abuela extends Mujer {
    private String nieto;
    private String hijo;
    public Abuela(String nombre, int edad, String esposo,String hijo ,String nieto , String familia) {
        super(nombre, edad, esposo, familia);
        this.nieto =  nieto;
        this.hijo = hijo;
        this.familia = familia;
        System.out.println("Nombre: " + nombre + "\n" + "Edad: " + edad + "\n" + "Esposo: " + esposo + "\n" + "Familia: " + familia + "\n" + "Nieto: " + nieto + "\n" +  "Hijo: " + hijo + "\n" + "\n" + "\n");
    }
    // GETTER Y SETTER
    public void setNieto(String nieto){this.nieto = nieto;}
    public String getNieto(){return this.nieto;}
    public void setHijo(String hijo){this.hijo = hijo ;}
    public String getHijo(){return this.hijo;}

    }
