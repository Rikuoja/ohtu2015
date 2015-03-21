package ohtu.verkkokauppa;

import java.util.ArrayList;

/**
 * Created by riku on 20.3.15.
 */
public interface Kirjanpito {
    void lisaaTapahtuma(String tapahtuma);

    ArrayList<String> getTapahtumat();
}
