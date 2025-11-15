import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        for(int i =b+1;i<=a;i++){
            if(i%c==0){
                System.out.println(i);
            }
        }
    }
}
