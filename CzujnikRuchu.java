public class CzujnikRuchu extends Urzadzenie {
    public CzujnikRuchu(String id, String nazwa, String lokalizacja) {
        super(id, nazwa, lokalizacja);
    }

    @Override
    public String pobierzSzczegolowyOpis() {
        return "Czujnik Ruchu: " + getNazwaPrzyjazna() + ", Lokalizacja: " + getLokalizacja() +
               ", Status: " + (pobierzStatus() ? "Aktywny" : "Nieaktywny");
    }
}