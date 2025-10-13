import java.util.Random;
public class Main {
    public static int zad1(int n){
        int p=0;

        for(int i=1;i<n;i++){
            int t=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    t++;
                }
            }
            if(t==2){
                p=i;
            }
        }

        return p;
    }

    public static double zad2(int n){
        double p=1;
        for(int i=0;i<n;i++){
               p*=7;
        }

        return 1/p;
    }
    public static int generateRandomIntInRange(int a, int b){
        Random rand = new Random();
        return rand.nextInt(a,b+1);
    }

    public static double zad4(int n){
        Random rand = new Random();
        double[] tab = new double[n];
        double s=0;

        for(int i=0;i<n;i++){
            tab[i] = rand.nextInt(1,101);
            s+=tab[i];
        }

        return s/20;
    }

    public static void main(String[] args) {
        //zad1
        System.out.println(zad1(10));
        //zad2
        System.out.println(zad2(2));
        //zad3
        System.out.println(generateRandomIntInRange(5,20));
        //zad4
        System.out.println(zad4(20));
    }
}