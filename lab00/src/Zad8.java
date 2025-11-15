import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String liczba = scanner.next();

        System.out.println(liczba);
        String t="";
        for(int i=liczba.length()-1; i>=0;i--){
            t += liczba.charAt(i);
        }
        System.out.println(t);
    }
}
