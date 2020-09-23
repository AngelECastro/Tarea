import Abuela.Abuela;
import Abuelo.Abuelo;
import Adolecenta.Adolecenta;
import Adolecentes.Adolecente;
import Chica.Chica;
import Chico.Chico;
import Familia.Familia;
import Madres.Madre;
import Padres.Padres;
import Tia.Tia;
import Tio.Tio;

@SuppressWarnings("unused")
public class Main {
    public  static  void main(String[]  args){
    	// FAMILIA  MARTINEZ
        Padres PichardoMartinez = new Padres("Pichardo", 86, "Si", "Tirsa", "Martinez");
        Madre TirsaMartinez = new Madre("Tirsa", 78, "Si", "Pichardo", " Martinez");
        Chico  MelvinMartinez = new Chico("Melvin", 43, "no",PichardoMartinez.nombre, TirsaMartinez.nombre, "Martinez" );
        Adolecenta RocioMartinez = new Adolecenta("Rocio", 49 , "no" ,PichardoMartinez.nombre,  TirsaMartinez.nombre , "Martinez");
        Tio JoseMartinez = new Tio("Jose", 78 , "Mara", MelvinMartinez.nombre + " y " + RocioMartinez.nombre, "Martinez" );
        Tia MaraMartinez = new Tia("Mara", 79 , JoseMartinez.nombre, MelvinMartinez.nombre + "y" + RocioMartinez.nombre , "Martinez" );
        Abuelo PepeMartinez = new Abuelo("Pepe" , 101, "Laura" , "Martinez",MelvinMartinez.nombre + " y " + RocioMartinez.nombre ,TirsaMartinez.nombre ); 
        Abuela LauraFinaMartinez = new Abuela("Laura", 98, PepeMartinez.nombre, TirsaMartinez.nombre, MelvinMartinez.nombre + " y " + RocioMartinez.nombre, "Martinez");

        // FAMILIA SANCHEZ
        Padres FabioSanchez = new Padres("Fabio", 42 , "si" , "Nicole" , "Sanchez");
        Madre nicoleSanchez = new Madre("Nicole" , 40 , "si" , "Fabio" , " Sanchez");
        Chica NoraSanchez = new Chica("Nora", 15 , "Si", FabioSanchez.nombre , nicoleSanchez.nombre, "Sanchez" );
        Adolecente KaynSanchez = new Adolecente("Kayn" , 22  , "Si " ,FabioSanchez.nombre ,nicoleSanchez.nombre, "Sanchez" );
        Tio TeoSanchez = new Tio("Teo", 47 , "Pira" , NoraSanchez.nombre + " y" + KaynSanchez.nombre , "Sanchez" );
        Tia PiraSanchez = new Tia("Pira", 38 ,TeoSanchez.nombre, KaynSanchez.nombre + " y" + NoraSanchez.nombre , "Sanchez");
        Abuelo AughustSanchez = new Abuelo("Aughust", 90 , "Mey", "Sanchez" ,KaynSanchez.nombre + " y" + NoraSanchez.nombre, FabioSanchez.nombre );
        Abuela MeySanchez = new Abuela("Mey", 87 ,AughustSanchez.nombre , FabioSanchez.nombre, KaynSanchez.nombre + " y" + KaynSanchez.nombre, "Sanchez");

    }
}
