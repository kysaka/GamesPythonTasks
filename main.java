public class Main {
    public static void main(String[] args) {
        Onlydistance.Mage mage = new Onlydistance().new Mage("Mage", 100, 10, 100, 50, 5, 1);
        Onlydistance.Monk monk = new Onlydistance().new Monk("Monk", 100, 10, 100, 50, 5, 1);
        
        Distance.Sniper sniper = new Distance().new Sniper("Mage", 100, 10, 100, 50, 5, 1);
        Distance.Crossbowman crossbowman = new Distance().new Crossbowman("Monk", 100, 10, 100, 50, 5, 1);

        System.out.println(mage.getInfo());
        System.out.println(monk.getInfo());
 
        System.out.println(sniper.getInfo());
        System.out.println(crossbowman.getInfo());
    }
}

