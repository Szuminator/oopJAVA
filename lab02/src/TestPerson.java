public class TestPerson {
    public static void main(String[] args){
        Person10 p1 = new Person10("Adam");
        Person10 p2 = new Person10("Kasia");
        p1.introduceYourself();
        p1.sayHello(p2);
        p1.changeName("Kuba");
        p1.introduceYourself();
        Person10 pp = new Person10("Mojżesz");
        Person10 pp2 = new Person10("Jezus");
        pp.introduceYourself();
        pp2.introduceYourself();
        pp.swapNames(pp2);
        pp.introduceYourself();
        pp2.introduceYourself();
    }
}
