public class Lampa extends Urzadzenie implements IPrzelaczalne {
    public Lampa(String id, String nazwa, String lokalizacja) {
        super(id, nazwa, lokalizacja);
    }

    @Override
    public void wlacz() {
        zmienStatus(true);
    }

    @Override
    public void wylacz() {
        zmienStatus(false);
    }

    @Override
    public String pobierzSzczegolowyOpis() {
        return "Lampa: " + getNazwaPrzyjazna() + ", Lokalizacja: " + getLokalizacja() +
               ", Status: " + (pobierzStatus() ? "Włączona" : "Wyłączona");
    }
}