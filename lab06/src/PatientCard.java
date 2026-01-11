import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PatientCard {

    private ArrayList<String> medicalHistory = new ArrayList<>();
    private ArrayList<String> allergies = new ArrayList<>();
    private ArrayList<String> medications = new ArrayList<>();

    public void addMedicalHistory(String entry) {
        if (entry == null || entry.isBlank()) return;
        medicalHistory.add(entry);
    }

    public void addAllergy(String allergy) {
        if (allergy == null || allergy.isBlank()) return;
        allergies.add(allergy);
    }

    public void addMedication(String medication) {
        if (medication == null || medication.isBlank()) return;
        medications.add(medication);
    }

    public List<String> getMedicalHistory(){
        return Collections.unmodifiableList(medicalHistory);
    }

    public List<String> getAllergies(){
        return Collections.unmodifiableList(allergies);
    }

    public List<String> getMedications(){
        return Collections.unmodifiableList(medications);
    }
}
