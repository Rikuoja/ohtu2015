package ohtu.verkkokauppa;

import java.util.ArrayList;

public class omaOstoskori implements Ostoskori {

    ArrayList<Tuote> tuotteet;

    public omaOstoskori() {
        tuotteet = new ArrayList<Tuote>();
    }

    @Override
    public void lisaa(Tuote t) {
        tuotteet.add(t);
    }

    @Override
    public void poista(Tuote t) {
        tuotteet.remove(t);
    }

    @Override
    public int hinta() {
        int hinta = 0;

        for (Tuote tuote : tuotteet) {
            hinta += tuote.getHinta();
        }

        return hinta;
    }
}
