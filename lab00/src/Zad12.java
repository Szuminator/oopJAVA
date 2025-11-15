import java.util.Scanner;

public class Zad12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = 0;
        int m =scanner.nextInt();
        int w =0;
        while(true){
            t = scanner.nextInt();
            if(t<0 || m<0){
                break;
            }
            if(t>m){
                if(t>w){
                    w=t;
                }
            }
            else {
                m=t;
            }

        }
        System.out.printf("Najmnijsza: %d\nNajwiększa: %d", m,w);
    }
}
