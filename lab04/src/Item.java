import java.util.ArrayList;

public abstract class Item {
    String name;
    public Item(String name){
        this.name = name;
    }
    abstract void use();
}

class Weapon extends Item{
    int damage;
    public Weapon(String name, int damage){
        super(name);
        this.damage = damage;
    }
    @Override
    public void use(){
        System.out.println("piu piu piu");
    }

    public int getDamage() {
        return damage;
    }
}

class Armor extends Item{
    int defense;

    public Armor(String name, int defense) {
        super(name);
        this.defense = defense;
    }
    @Override
    public void use(){
        System.out.println("bang bang");
    }

    public int getDefense() {
        return defense;
    }
}

class Fighter{
    private Armor armor;
    ArrayList<Weapon> weapons = new ArrayList<>();

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public void addWeapon(Weapon weapon) {
        this.weapons.add(weapon);
    }

    public void useEq(){
        if(armor != null){
            armor.use();
        }
        else{
            weapons.get(0).use();
        }
    }
}