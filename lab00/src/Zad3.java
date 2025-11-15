import java.util.Scanner;
public class Zad3 {
    public static void main (String[] args){
        System.out.println("dadada");

        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        double d=scanner.nextInt();

        a+=4;
        b-=a;
        c*=2-(4*a);
        d/=4-(Math.pow(a,2));

        System.out.printf("a = %d \nb = %d \nc = %d \nd = %.2f", a,b,c,d);
    }
}
