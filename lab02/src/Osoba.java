public class Osoba {
    public String name;
    public String surname;

    private Osoba(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    static public Osoba create(String name, String surname){
        return new Osoba(name, surname);
    }
}
