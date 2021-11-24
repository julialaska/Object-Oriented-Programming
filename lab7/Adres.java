package pl.imiajd.laska;

public class Adres {

    public Adres(String ulica, double numer_domu, String miasto, String kod_pocztowy) {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public Adres(String ulica, double numer_domu, String miasto, String kod_pocztowy, double numer_mieszkania) {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
        this.numer_mieszkania = numer_mieszkania;
    }

    public String pokaz() {
        return "kod pocztowy: " + kod_pocztowy +
                ", miasto: " + miasto + "\n" +
                ", ulica" + ulica +
                "' numer domu " + numer_domu;

    }

    public boolean przed(Adres compareTo) {
        String adres_1 = kod_pocztowy.replace("-", "");
        String adres_2 = compareTo.kod_pocztowy.replace("-", "");
        Integer valueOf1 = Integer.valueOf(adres_1);
        Integer valueOf2 = Integer.valueOf(adres_2);

        if (valueOf1 < valueOf2)
            return true;
        return false;
    }

    private String ulica;
    private double numer_domu;
    private double numer_mieszkania;
    private String miasto;
    private String kod_pocztowy;

}