package Humano;

import Padres.Padres;

interface HumanoMeotodo{
    public String saludar(String nombre , String familia);
}

public class Main extends  Humano {
    public String saludar(String nombre , String familia) {
        return nombre + familia;
    }

}
