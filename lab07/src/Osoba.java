import java.util.Comparator;

public class Osoba{
    String imie;
    int wiek;
    double wzrost;

    public int getWiek() {
        return wiek;
    }

    public Osoba(String imie, int wiek, double wzrost) {
        this.imie = imie;
        this.wiek = wiek;
        this.wzrost = wzrost;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                ", wzrost=" + wzrost +
                '}';
    }
}

class OsobaComparator implements Comparator<Osoba>{
    @Override
    public int compare(Osoba o1, Osoba o2) {
        return Integer.compare(o1.getWiek(), o2.getWiek());
    }
}
