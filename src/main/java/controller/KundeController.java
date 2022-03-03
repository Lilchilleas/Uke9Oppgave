package controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.KundeRepository;

import java.util.List;

@RestController
public class KundeController {

    @Autowired
    KundeRepository ab;

    //Lagre
    @PostMapping("/lagre")
    public void function1(Kunde a){
        ab.lagre(a);
    }

    //Hente
    @GetMapping("/hente")
    public List<Kunde> function2() {
        return ab.hente();
    }

    //Slette
    @DeleteMapping("/slette")
    public void function3() {
        ab.slette();
    }

}
