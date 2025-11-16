import java.util.ArrayList;
import java.util.Random;

public class Zad1_10 {
    public static int zad1(int n){
        int t=0;
        for(int i=n-1;i>0;i--){
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    t++;
                }
            }
            if(t==2){
                t=i;
                break;
            }
            t=0;
        }
        return t;
    }

    public static double zad2(int n){
        return 1/Math.pow(7,n);
    }

    public static int generateRandomIntInRange(int a, int b){
        Random random = new Random();
        return random.nextInt(a,b+1);
    }

    public static void zad4(){
        Random random = new Random();
        int[] tab = new int[20];
        double sum=0;

        for(int i=0;i<20;i++){
            tab[i] = random.nextInt(1,101);
            sum+=tab[i];
        }

        System.out.println(sum/20);
    }

    public static void zad5(){
        Random random = new Random();
        int[] tab = new int[30];
        int sum=0;

        for(int i=0;i<30;i++){
            tab[i] = random.nextInt(1,101);
            if((int)Math.sqrt(tab[i])*(int)Math.sqrt(tab[i])==tab[i]){
                sum++;
                //System.out.println(tab[i]);
            }
        }

        System.out.println(sum);
    }

    public static int minimumValue(ArrayList<Integer> list){
        int min = list.get(0);
        for(int i=0;i< list.size();i++){
            if(list.get(i)<min){
                min=list.get(i);
            }
        }
        return min;
    }

    public static ArrayList<Integer> reverseArray(ArrayList<Integer> list){
        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i=list.size()-1;i>=0;i--){
            list1.add(list.get(i));
        }
        return list1;
    }

    public static String zad8(String nap){
        char last = nap.charAt(nap.length()-1);
        char first = nap.charAt(0);
        String middle = nap.substring(1,nap.length()-1);
        return last+middle+first;
    }

    public static void zad9(char sign, int n){
        for (int i=0;i<n;i++){
            StringBuilder sb = new StringBuilder(sign);
            for (int j=0;j<2*i+1;j++){
                sb.append(sign);
            }
            System.out.println(sb);
        }
    }
}
