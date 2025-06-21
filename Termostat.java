public class Termostat extends Urzadzenie implements IRegulowalne {
    private int temperatura;

    public Termostat(String id, String nazwa, String lokalizacja) {
        super(id, nazwa, lokalizacja);
        this.temperatura = 20;
    }

    @Override
    public void ustawWartosc(int wartosc) {
        this.temperatura = wartosc;
    }

    @Override
    public String pobierzSzczegolowyOpis() {
        return "Termostat: " + getNazwaPrzyjazna() + ", Lokalizacja: " + getLokalizacja() +
               ", Temperatura: " + temperatura + "°C";
    }
}