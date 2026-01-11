public class Zad4 {
    public static void main(String[] args) {
        try{
            checkAge(12);
        }catch (IllegalArgumentException e){
            System.out.println("błąd:"+e.getMessage());
        }
    }

    public static void checkAge(int age) throws IllegalArgumentException{
        if (age<18) throw new IllegalArgumentException("Wiek < 18");
    }
}

