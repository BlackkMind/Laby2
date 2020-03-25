package laby2;

import java.util.Date;

public class Książki extends Utwór {
    int Iloscstron;
    public Książki(Date wydanie, String autor,String wydawca, int cena, String tytul, int Iloscstron ){
        super(wydanie, autor,wydawca, cena, tytul);
        this.Iloscstron = Iloscstron;

    }
}
