void main() {
    BookDTO b1 = new BookDTO("W puszczy", "Sienkiewicz chyba", 30.00, 1998);
    BookDTO b2 = new BookDTO("Dzady", "Slowak", 34.00, 2003);
    BookDTO b3 = new BookDTO("Czarno to widze", "Dr. Hab. Koko", 320.00, 2025);

    System.out.println(b1.author() + b2.author());

    BankAccount a1 = new BankAccount("04234023402349235", 300);

    System.out.println(a1.numerKonta() +" - " + a1.saldo()+" zł");
    a1.withInterest(2);
    System.out.println(a1.numerKonta() +" - " + a1.saldo()+" zł");
    BankAccount nowekonto = a1.withInterest(2);
    System.out.println(nowekonto.numerKonta() +" - " + nowekonto.saldo()+" zł");

    Patient p1 = new Patient("Jarek", "Ogarek", LocalDate.of(2003,11,11));
    Patient p2 = new Patient("Bartek", "Majtek", LocalDate.of(2002,6,5));

    p1.getCard().addAllergy("Banan");
    p1.getCard().addMedicalHistory("zlamana głowa");
    p1.getCard().addMedication("Ketanal");

    Doctor d1 = new Doctor("Marek", "Grachuta", "Ortopeda");
    d1.addPatient(p1);
    d1.addPatient(p2);

    System.out.println(d1);

    for (Patient p: d1.getPatient()){
        System.out.println(" - "+p);
    }

    try{
        sprawdzFormatDanych("lo");
    }catch (NiepoprawnyFormatDanychException e){
        System.out.println("błąd: "+ e.getMessage());
    }
}
public static void sprawdzFormatDanych(String dane) throws NiepoprawnyFormatDanychException{
    if (dane.length() < 3) throw new NiepoprawnyFormatDanychException("zly format");
}