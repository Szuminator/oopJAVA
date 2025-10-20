
public class Main {
    public static void main(String[] args) {
        //zad1
        Dog d1 = new Dog();
        d1.bark();

        //zad2
        Point p1 = new Point(2.0,5.0);
        Point p2 = new Point(6.0,8.0);
        System.out.println(p1.distance(p2));

        //zad3
        Person pe1 = new Person();
        pe1.name = "Robert";
        //pe1.password; - daje błąd poniewaz nie mamy dostęp do pola private.

        //zad4
        //chyba się nie da, bo coś nie dziła.

        //zad5
        Book b1 = new Book("Java", "Jan Kowalski", 2070);
        System.out.printf("tytul: %s, autor: %s, rok wydania: %d\n", b1.title,b1.author, b1.publicationYear);

        //zad6
        Car c1 = new Car();
        System.out.printf("Marka: %s, Model: %s, rok produkcji: %d\n", c1.brand,c1.model, c1.productionYear);
        Car c2 = new Car("Honda","Civic");
        System.out.printf("Marka: %s, Model: %s, rok produkcji: %d\n", c2.brand,c2.model, c2.productionYear);
        Car c3 = new Car("Ford","Mondeo",2009);
        System.out.printf("Marka: %s, Model: %s, rok produkcji: %d\n", c3.brand,c3.model, c3.productionYear);

        //zad7
        Television t1 = new Television("LG",62,4000,false,6000);
        t1.setBrand("Samsung");
        t1.setScreenDiagonal(52);
        t1.setResolution(4000);
        t1.setSmartTV(true);
        t1.setPrize(3500);
        t1.showInformation();

        //zad8
        Osoba o1 = Osoba.create("Andrzej", "Wajda");
        System.out.println("\n"+o1.surname +" "+ o1.name);
    }
}