import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Doctor {
    String firstName;
    String lastName;
    String specialization;

    ArrayList<Patient> patients = new ArrayList<>();

    public Doctor(String firstName, String lastName, String specialization) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialization = specialization;
    }

    public void addPatient(Patient patient){
        patients.add(patient);
    }

    public void removePatient(Patient patient) {
        patients.remove(patient);
    }

    public List<Patient> getPatient(){
        return Collections.unmodifiableList(patients);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
