import java.util.Scanner;

public class zad2 {
    public static void main(String[] args){
        int equ=0;
        double equ2=0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int a = scanner.nextInt();
        System.out.print("Podaj liczbe: ");
        int b = scanner.nextInt();
        //scanner.next();
        System.out.print("wybierz opcje(+,-,*,/): ");
        String choice = scanner.next();
        System.out.println();
        switch (choice){
            case "+":
                equ = a+b;
                break;
            case "-":
                equ = a-b;
                break;
            case "*":
                equ2 = a*b;
                break;
            case "/":
                equ2 = a/b;
                break;
        }
        if(choice=="+" || choice=="-"){
            System.out.println(equ);
        }
        else{
            System.out.println(equ2);
        }
    }
}
