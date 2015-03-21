package ohtu.verkkokauppa;

/**
 * Created by riku on 20.3.15.
 */
public interface Pankki {
    boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa);
}
