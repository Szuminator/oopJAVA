//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //Zad1
    System.out.println(Zad1_10.zad1(20));

    //Zad2
    System.out.println(Zad1_10.zad2(2));

    //zad3
    System.out.println(Zad1_10.generateRandomIntInRange(2,8));

    //zad4
    Zad1_10.zad4();

    //zad5
    Zad1_10.zad5();

    //zad6
    ArrayList<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(1);
    list.add(5);
    list.add(354);
    list.add(103);
    System.out.println(Zad1_10.minimumValue(list));

    //zad7
    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(1);
    list2.add(2);
    list2.add(3);
    list2.add(4);
    list2.add(5);
    System.out.println(Zad1_10.reverseArray(list2));

    //zad8
    System.out.println(Zad1_10.zad8("Witam"));

    //zad9
    Zad1_10.zad9('*',3);
}
