import animals.Cat;
import animals.Dog;

public class Zad1 {
    public static void main(String[] args) {
        Cat cat = new Cat("Bonifacy", 45);
        Dog dog = new Dog("Azor", 13);

        System.out.printf("%s, lat %d: ", cat.name,cat.age);
        cat.makeSound();
        System.out.printf("%s, lat %d: ", dog.name,dog.age);
        dog.makeSound();
    }
}