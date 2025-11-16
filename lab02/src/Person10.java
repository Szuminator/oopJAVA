public class Person10 {
    String name;

    public Person10(String name) {
        this.name = name;
    }

    public void introduceYourself(){
        System.out.println("Hi, I'm "+ this.name);
    }

    public void sayHello(Person10 person){
        System.out.println("Hello "+ person.name);
    }

    public void changeName(String name){
        this.name = name;
    }

    public void swapNames(Person10 name){
        String t = this.name;
        this.name = name.name;
        name.name = t;
    }
}
