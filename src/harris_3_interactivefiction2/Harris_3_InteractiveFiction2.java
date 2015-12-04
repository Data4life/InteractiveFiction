package harris_3_interactivefiction2;
import java.util.Scanner;
public class Harris_3_InteractiveFiction2 {
    static int Damage;
    static int Range;
    static int Armor;
    static int Weapon;
    public static void main(String[] args) {
        Attributes();
        Weapon();
        Sword();
        Swordtraining();
        Spear();
        Speartraining();
        Bow();
        Bowtraining();
        Handtraining();
        EpicBattleOfAllTime();
        
    }
    static void Attributes() {
        System.out.println("Your Damage is = "+Damage+",Your Range is = "+Range+", Your Defense is = "+Armor);
    }
    static void Weapon(){                          //Begaining
        System.out.println("You just turned 18 a month ago and you are enlisted into the army.");
        System.out.println("You are in the Country of rome and you are going to war.");
        System.out.println("When you get to the army base you are greeted along with the rest of your");
        System.out.println("troop by the general of the army.");
        System.out.println("He seperates you by what weapon you will wield. Sword(1) or Spear(2) or Bow & Arrow(3)?");
        Scanner Weapon = new Scanner(System.in);
        int a = Weapon.nextInt();
            if (a==1) {
                Sword();
            }
            if (a==2) {
                Spear();
            }
            if (a==3) {
                Bow();
            }
            if (a==9) {
                Attributes();
                Weapon();
            }
            else {
                System.out.println("Please repeat");
                Weapon();
            }
            
    }
    static void Sword() {                            //You choose sword
        Range=4;
        Damage=3;
        System.out.println("You chose Sword (Range="+Range+" Damage="+Damage+").");
        System.out.println("After your troop was seperated you are givin the choice on what skill to train.");
        System.out.println("You can choose whether to train your hand-to-hand(1) or your Sword(2).");
        Scanner Training = new Scanner(System.in);
        int b = Training.nextInt();
            if (b==1) {
                
            }
            if (b==2) {
                Swordtraining();
            }
            if (b==9) {
                Attributes();
                Sword();
            }
            else {
                System.out.println("Please repeat");
                Sword();
            }
    }
    static void Spear()     {                          //You Choose spear
        Range=5;
        Damage=2;
        System.out.println("You chose Spear (Range="+Range+" Damage="+Damage+").");
        System.out.println("After your troop was seperated you are givin the choice on what skill to train.");
        System.out.println("You can choose whether to train your hand-to-hand(1) or your spear(2).");
        Scanner Training = new Scanner(System.in);
        int c = Training.nextInt();
        if (c==1) {
            Handtraining();
        }
        if (c==2) {
            Speartraining();
        }
        if (c==9) {
            Attributes();
            Spear();
        }
        else {
            System.out.println("Please repeat");
            Spear();
        }
    }
    static void Bow() {                            //You choose bow
        Range=10;
        Damage=1;
        System.out.println("You chose Bow & Arrow (Range="+Range+" Damage="+Damage+").");
        System.out.println("After your troop was seperated you are givin the choice on what skill to train.");
        System.out.println("You can choose whether to train your hand-to-hand(1) or your bow(2).");
        Scanner Training = new Scanner(System.in);
        int d = Training.nextInt();
        if (d==1) {
            Handtraining();
        }
        if (d==2) {
            Bowtraining();
        }
        if (d==9) {
            Attributes();
            Bow();
        }
        else {
            System.out.println("Please repeat");
            Bow();
        }
    }
    static void Swordtraining() {
        Range=Range+1;
        System.out.println("You chose to train your Sword skills. You acquired the Slash skill.");
        EpicBattleOfAllTime();
    }
    static void Speartraining() {
        Range=Range+1;
        System.out.println("You chose to train your Spear skills. You acquired the Lunge Stab skill.");
        EpicBattleOfAllTime();
    }
    static void Bowtraining() {
        Range=Range+1;
        System.out.println("You chose to train your Bow skills. You acquired the Longbow item.");
        EpicBattleOfAllTime();
        
    }
    static void Handtraining() {
        Damage=Damage+1;
        System.out.println("You chose to train your Hand-to-Hand skills. You acquired the RKO skill.");
        EpicBattleOfAllTime();
    }
    static void EpicBattleOfAllTime() {
        System.out.println("You have now been training for months for this day.");
        System.out.println("As the enemy comes closer you can see who they are,");
        System.out.println("They Are The Spartans.");
        System.out.println("As you engage with an enemy soldier you remember the legends about how every \none spartan can defeat ten enemy soldiers");
        if (Damage-Range<6) {
            System.out.println("*******");
            System.out.println("you win");
            System.out.println("*******");
        }else {
            System.out.println("********");
            System.out.println("you lose");
            System.out.println("********");
        }
    }
}
