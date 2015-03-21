package ohtu.verkkokauppa;

import org.springframework.stereotype.Component;

@Component
public class omaViitegeneraattori implements Viitegeneraattori {

    private int seuraava;
    
    public omaViitegeneraattori(){
        seuraava = 1;    
    }
    
    @Override
    public int uusi(){
        return seuraava++;
    }
}
