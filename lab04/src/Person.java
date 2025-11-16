public class Person {
    private String firstName = "Witold";
    protected String lastName = "Pilecki";

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Employee extends Person{
    void od(){
        String a = super.lastName;
        // do first sie nie da
    }

    public void displayData(){
        System.out.println("imie: "+getFirstName()+" nazwisko: "+getLastName());
    }
}
