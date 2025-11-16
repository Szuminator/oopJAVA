
void main() {
    Employee e = new Employee();
    e.displayData();

    Car c1 = new Car("Opel", "Astra", 5);

    System.out.println(c1.brand);

    RPG r1 = new RPG();

    Hammer h1 = new Hammer();
    ScrewDriver SD1 = new ScrewDriver();
    Saw S1 = new Saw();

    h1.use();
    SD1.use();
    S1.use();

    Fighter f1 = new Fighter();

    f1.setArmor(new Armor("Steel Armor", 50));

    f1.addWeapon(new Weapon("Sword", 35));
    f1.addWeapon(new Weapon("Bow", 20));

    f1.useEq();
}
