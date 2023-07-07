public class Main {
    public static void main(String[] args) {
        onlydistance.Mage mage = new onlydistance().new Mage("Mage", 100, 10, 100, 50, 5, 1);
        onlydistance.Monk monk = new onlydistance().new Monk("Monk", 100, 10, 100, 50, 5, 1);
        
        distance.Sniper sniper = new distance().new Sniper("Mage", 100, 10, 100, 50, 5, 1);
        distance.Crossbowman crossbowman = new distance().new Crossbowman("Monk", 100, 10, 100, 50, 5, 1);

        System.out.println(mage.getInfo());
        System.out.println(monk.getInfo());
 
        System.out.println(sniper.getInfo());
        System.out.println(crossbowman.getInfo());
    }
}

