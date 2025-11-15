import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        System.out.println("Podaj dochud: ");
        Scanner scanner = new Scanner(System.in);
        double kwota = scanner.nextDouble();

        double podatek=0;
        if (kwota <= 85528){
            podatek = kwota*0.18;
        }
        else{
            podatek = 14839.02 + (kwota - 85528)*0.32;
        }

        System.out.printf("Podatek: %.2f", podatek);
    }
}
