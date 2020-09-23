package Familia;

import Abuela.Abuela;
import Abuelo.Abuelo;
import Adolecenta.Adolecenta;
import Adolecentes.Adolecente;
import Chica.Chica;
import Chico.Chico;
import Madres.Madre;
import Padres.Padres;
import Tia.Tia;
import Tio.Tio;

public class Familia extends Familia_Code {

    public Familia(String Apellido , Padres padre, Madre madre, Chica hijaPeque, Adolecente hijoAdolecente, Tio tio, Tia tia, Abuelo abuelo, Abuela abuela) {
        setApellido(Apellido);
        setPadre(padre);
        setMadre(madre);
        setHijaPeque(hijaPeque);
        setHijoAdolecente(hijoAdolecente);
        setTio(tio);
        setTia(tia);
        setAbuelo(abuelo);
        setAbuela(abuela);
    }

    public Familia(  String Apellido,Padres padre, Madre madre, Adolecenta hijaAdolecente, Chico hijoPeque, Tio tio, Tia tia, Abuelo abuelo, Abuela abuela) {
        setApellido(Apellido);
        setPadre(padre);
        setMadre(madre);
        setHijaAdolecente(hijaAdolecente);
        setHijoPeque(hijoPeque);
        setTio(tio);
        setTia(tia);
        setAbuelo(abuelo);
        setAbuela(abuela);
    }

}
