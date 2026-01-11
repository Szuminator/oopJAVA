import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

void main() {
    ArrayList<Student> students = new ArrayList<>();
    Student s1 = new Student("Robert", 2003, 4.75);
    Student s2 = new Student("Carlo", 2099, 5.00);
    Student s3 = new Student("Marta", 1922, 3.34);
    Student s4 = new Student("Drak", 1980, 3.22);
    Student s5 = new Student("Jelonek", 1970, 4.25);

    students.add(s1);
    students.add(s2);
    students.add(s3);
    students.add(s4);
    students.add(s5);

    Collections.sort(students);

    for(Student s : students){
        System.out.println(s.name+"\n");
    }

    List<Product> products = new ArrayList<>();
    products.add(new Product("Milk", 4.99, LocalDate.of(2026, 1, 20)));
    products.add(new Product("Bread", 3.20, LocalDate.of(2026, 1, 12)));
    products.add(new Product("Cheese", 12.50, LocalDate.of(2026, 2, 5)));
    products.add(new Product("Yogurt", 2.99, LocalDate.of(2026, 1, 20)));
    products.add(new Product("Butter", 7.30, LocalDate.of(2026, 2, 5)));

    Collections.sort(products);

    for (Product p : products){
        System.out.println(p.name+"\n");
    }

    List<Osoba> osoby = new ArrayList<>();
    osoby.add(new Osoba("Ania", 21, 1.65));
    osoby.add(new Osoba("Hania", 1, 1.80));
    osoby.add(new Osoba("Kasia", 221, 1.68));
    osoby.add(new Osoba("Basia", 34, 1.55));
    osoby.add(new Osoba("Jasia", 12, 1.91));

    osoby.sort(new OsobaComparator());

    for (Osoba o : osoby){
        System.out.println(o.imie+"\n");
    }

    List<Order> orders = new ArrayList<>();
    orders.add(new Order(1, "Zuzanna", LocalDate.of(2026, 1, 10)));
    orders.add(new Order(2, "Adam",    LocalDate.of(2026, 1, 10)));
    orders.add(new Order(3, "Karol",   LocalDate.of(2026, 1, 12)));
    orders.add(new Order(4, "Bartek",  LocalDate.of(2026, 1, 9)));
    orders.add(new Order(5, "Ania",    LocalDate.of(2026, 1, 12)));

    orders.sort(new DateComp().thenComparing(new NameComp()));

    for (Order o : orders){
        System.out.println(o.customerName+"\n");
    }

    LoudAnimal dog = new Dog();
    LoudAnimal cat = new Cat();

    dog.makeNoise();
    cat.makeNoise();
}
