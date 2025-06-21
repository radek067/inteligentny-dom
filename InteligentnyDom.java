import java.util.ArrayList;

public class InteligentnyDom {
    private String nazwaDomu;
    private ArrayList<Urzadzenie> listaUrzadzen;

    public InteligentnyDom(String nazwaDomu) {
        this.nazwaDomu = nazwaDomu;
        this.listaUrzadzen = new ArrayList<>();
    }

    public void dodajUrzadzenie(Urzadzenie u) {
        listaUrzadzen.add(u);
    }

    public void wyswietlStatusWszystkichUrzadzen() {
        System.out.println("Status urządzeń w domu: " + nazwaDomu);
        for (Urzadzenie u : listaUrzadzen) {
            System.out.println(u.pobierzSzczegolowyOpis());
        }
    }

    public void wlaczWszystkiePrzelaczalne() {
        for (Urzadzenie u : listaUrzadzen) {
            if (u instanceof IPrzelaczalne) {
                ((IPrzelaczalne) u).wlacz();
            }
        }
    }

    public void ustawTemperature(int temperatura) {
        for (Urzadzenie u : listaUrzadzen) {
            if (u instanceof IRegulowalne) {
                ((IRegulowalne) u).ustawWartosc(temperatura);
            }
        }
    }
}