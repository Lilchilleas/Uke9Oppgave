package repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class KundeRepository {



    private final List<Kunde> a = new ArrayList<>();


    //Lagre
    public void lagre(Kunde x) {
        a.add(x);
    }


    //Hente
    public List<Kunde> hente() {
        return a;
    }

    //Slette
    public void slette() {
        a.clear();
    }


}
