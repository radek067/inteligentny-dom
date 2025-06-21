public abstract class Urzadzenie {
    private String idUrzadzenia;
    private String nazwaPrzyjazna;
    private String lokalizacja;
    private boolean status;

    public Urzadzenie(String idUrzadzenia, String nazwaPrzyjazna, String lokalizacja) {
        this.idUrzadzenia = idUrzadzenia;
        this.nazwaPrzyjazna = nazwaPrzyjazna;
        this.lokalizacja = lokalizacja;
        this.status = false;
    }

    public boolean pobierzStatus() {
        return status;
    }

    public void zmienStatus(boolean nowyStatus) {
        this.status = nowyStatus;
    }

    public abstract String pobierzSzczegolowyOpis();

    public String getIdUrzadzenia() {
        return idUrzadzenia;
    }

    public String getNazwaPrzyjazna() {
        return nazwaPrzyjazna;
    }

    public String getLokalizacja() {
        return lokalizacja;
    }
}