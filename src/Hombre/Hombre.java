package Hombre;
import Humano.Main;

	// EL POLIMORFISMO
public class Hombre extends Main {
    private  String esposa ;
    public Hombre(String nombre, int edad, String esposa,String familia) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = "Masculino";
        this.esposa = esposa ;
        this.familia = familia ;
    }

	// GETTER Y SETTER
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
     public String getNombre(){
        return this.nombre ;
    }
    public void  setSexo(String sexo){
        this.sexo = sexo ;
    }
    public String getSexo(){
        return sexo ;
    }
    public void setEdad(int edad){
        this.edad = edad ;
    }
    public int getEdad(){
        return  this.edad ;
    }
    public void setEsposa(String esposa){
        this.esposa = esposa ;
    }
    public String getEsposa() {
        return esposa;
    }
    public void  setFamilia(String familia){this.familia = familia;}
    public String getFamilia(){return this.familia;}
}
