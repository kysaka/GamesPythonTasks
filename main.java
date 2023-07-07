import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Onlydistance.Mage mage = new Onlydistance().new Mage("Mage", 100, 10, 100, 50, 5, 1);
        Onlydistance.Monk monk = new Onlydistance().new Monk("Monk", 100, 10, 100, 50, 5, 1);
        
        Distance.Sniper sniper = new Distance().new Sniper("Mage", 100, 10, 100, 50, 5, 1);
        Distance.Crossbowman crossbowman = new Distance().new Crossbowman("Monk", 100, 10, 100, 50, 5, 1);

        System.out.println(mage.getInfo());
        System.out.println(mage.getInfo1());

        System.out.println(monk.getInfo());
        System.out.println(monk.getInfo1());
 
        System.out.println(sniper.getInfo());
        System.out.println(sniper.getInfo1());

        System.out.println(crossbowman.getInfo());
        System.out.println(crossbowman.getInfo1());

        Peasant peasant = new Peasant(getName());

        
        System.out.println(peasant.getInfo1());

        ArrayList<Peasant> list = new ArrayList<>();
        list.add(new Peasant(getName()));
        list.get(0).getInfo();
        
    }

    private static String getName(){
        String s = String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
        return s;
    }

}

