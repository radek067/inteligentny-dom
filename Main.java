public class Main {
    public static void main(String[] args) {
        InteligentnyDom dom = new InteligentnyDom("Dom Testowy");

        Lampa l1 = new Lampa("001", "Lampa salon", "Salon");
        Termostat t1 = new Termostat("002", "Termostat kuchnia", "Kuchnia");
        CzujnikRuchu c1 = new CzujnikRuchu("003", "Czujnik drzwi", "Przedpokój");

        dom.dodajUrzadzenie(l1);
        dom.dodajUrzadzenie(t1);
        dom.dodajUrzadzenie(c1);

        dom.wyswietlStatusWszystkichUrzadzen();

        System.out.println("\nWłączanie urządzeń...");
        dom.wlaczWszystkiePrzelaczalne();

        System.out.println("Ustawianie temperatury na 23°C...");
        dom.ustawTemperature(23);

        System.out.println("\nPo zmianach:");
        dom.wyswietlStatusWszystkichUrzadzen();
    }
}