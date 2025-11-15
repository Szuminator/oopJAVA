import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int mon = scanner.nextInt();
        int rok = scanner.nextInt();

        if(rok%400==0){
            System.out.println("Przestępny");
        } else if (rok%4==0 && rok%100!=0) {
            System.out.println("Przestępny");
        }
        else{
            System.out.println("Nie przestepny");
        }

//        switch (mon){
//            case "styczen", "marzec", "maj", "lipiec", "sierpień", "październik", "grudzień":
//
//                break;
//        }
    }
}