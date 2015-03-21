package ohtu.verkkokauppa;

/**
 * Created by riku on 20.3.15.
 */
public interface Varasto {
    Tuote haeTuote(int id);

    int saldo(int id);

    void otaVarastosta(Tuote t);

    void palautaVarastoon(Tuote t);
}
