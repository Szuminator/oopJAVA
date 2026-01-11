import java.time.LocalDate;

public class Patient {

    String firstName;
    String lastName;
    LocalDate birthDate;

    PatientCard kartaPacynka;

    public Patient(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.kartaPacynka = new PatientCard();
    }

    public PatientCard getCard(){
        return kartaPacynka;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
