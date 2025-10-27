import java.util.ArrayList;
public class Zad5 {
    public static void main(String[] args) {
        Szkola s = new Szkola();

        s.setUczniowie("Kacper Kowal");
        s.setUczniowie("Monika Kociol");
        s.setUczniowie("Adrian Koterwa");
        s.setUczniowie("Aga Szpaga");

        ArrayList<String> listaUczniow = s.getUczniowie();

        for (String uczen : listaUczniow) {
            System.out.println(uczen);
        }

    }
}
