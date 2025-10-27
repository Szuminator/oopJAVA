public class KalkulatorStatyczny {

    static int liczbaOperacji=0;
    static int dodaj(int a, int b){
        liczbaOperacji++;
        return a+b;
    }
    static int odejmij(int a, int b){
        liczbaOperacji++;
        return a-b;
    }
    static int pomnoz(int a, int b){
        liczbaOperacji++;
        return a*b;
    }
}
