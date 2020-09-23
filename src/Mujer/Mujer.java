package Mujer;
import Humano.Main;

public class Mujer extends  Main{

        private String esposo ;
        public Mujer(String nombre, int edad, String esposo, String familia) {
            this.nombre = nombre ;
            this.edad = edad ;
            this.sexo = "Femenina" ;
            this.esposo = esposo ;
            this.familia = familia ;
        }

        // GETTER Y SETTER
        public  void setNombre ( String nombre){
            this.nombre = nombre ;
        }
        public String getNombre(){
            return this.nombre ;
        }
        public  void  setSexo( String sexo){
            this.sexo = sexo ;
        }
        public  String getSexo(){
            return sexo ;
        }
        public  void setEdad(int edad){
            this.edad = edad ;
        }
        public  int getEdad(){
            return  this.edad ;
        }
        public void setEsposa( String esposo){
            this.esposo = esposo ;
        }

        public String getEsposa() {
            return esposo;
        }

        public  void setFamilia(String familia){ this.familia = familia ; }
        public String getFamilia(){return this.familia; }

}

