import java.util.Scanner;

// [PILLAR: ABSTRACTION]
abstract class Hero { 
    // [PILLAR: ENCAPSULATION]
    protected String nama;
    protected int health;

    public Hero(String n, int h) {
        this.nama = n;
        this.health = h;
    }

    // [ENCAPSULATION - SETTER]
    void setNama(String n){
        nama = n;
    }
    void setHealth(int h){
        if(h < 0){
            System.out.println("Health gaboleh dibawah 0!");
        }else{
            health = h;
        }
    }

    // [ENCAPSULATION - GETTER]
    String getNama(){ 
        return nama;
    }

    public void cekStatus() {
        System.out.println("Hero: " + nama + "|" + "HP: " + health);
    }

    // [ABSTRACTION - ABSTRACT METHOD]
    public abstract void skill();
}

// [PILLAR: INHERITANCE]
class Warrior extends Hero {
    private int armor;

    public Warrior(String n, int h, int a) {
        super(n, h); 
        this.armor = a;
    }

    // [PILLAR: POLYMORPHISM]
    @Override
    public void skill() {
        System.out.println("WARRIOR " + nama + " MENGENAKAN ARMOR SEBESAR " + armor + ".");
    }
}

// [PILLAR: INHERITANCE]
class Mage extends Hero {
    private int mana;

    public Mage(String n, int h, int m) {
        super(n, h);
        this.mana = m;
    }

    // [PILLAR: POLYMORPHISM]
    @Override
    public void skill() {
        System.out.println("MAGE " + nama + " MENGGUNAKAN MANA SEBESAR " + mana + " UNTUK MENGGUNAKAN ULTI.");
    }
}

public class Main{
    public static void main(String[] args) {
        Warrior w1 = new Warrior("Balmond", 2450, 150);
        Mage m1 = new Mage("Odette", 1500, 45);
        System.out.println("");
        System.out.println("Mengambil nama lewat getter: " + w1.getNama());

        w1.cekStatus();
        m1.cekStatus();
        System.out.println("");

        w1.skill();
        m1.skill();
        System.out.println("");
    }
}