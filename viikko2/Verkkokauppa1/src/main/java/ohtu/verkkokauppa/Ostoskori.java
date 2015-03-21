package ohtu.verkkokauppa;

/**
 * Created by riku on 20.3.15.
 */
public interface Ostoskori {
    void lisaa(Tuote t);

    void poista(Tuote t);

    int hinta();
}
