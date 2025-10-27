import java.util.ArrayList;

public class Szkola {
    private ArrayList<String> uczniowie = new ArrayList<String>();

    public void setUczniowie(String uczen) {
        this.uczniowie.add(uczen);
    }

    public ArrayList<String> getUczniowie() {
        return uczniowie;
    }
}
