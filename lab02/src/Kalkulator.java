public class Kalkulator {

    private boolean sprawdzDane(int a, int b){
        if(a<0 || b<0){
            System.out.println("Ujemne");
            return false;
        }
        return true;
    }

    public int obliczSume(int a, int b){
        if(sprawdzDane(a,b)){
            return a+b;
        }
        return 0;
    }
}
