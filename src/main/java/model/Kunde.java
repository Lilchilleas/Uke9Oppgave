package model;

public class Kunde {


    //Instance Variables
    private String navn;
    private String alder;
    private String epost;

    //Constructor
    public Kunde(String navn, String alder, String epost) {
        this.navn = navn;
        this.alder = alder;
        this.epost = epost;
    }



    //Getters and Setters

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getAlder() {
        return alder;
    }

    public void setAlder(String alder) {
        this.alder = alder;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }

}
