import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
        System.out.println("Podaj:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int i=Math.max(a,b);
        while(true){
            if(i%a==0 && i%b==0){
                break;
            }
            i++;
        }
        System.out.println(i);
    }
}
