import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Onlydistance.Mage mage = new Onlydistance().new Mage("Mage", 1,1);
        Onlydistance.Monk monk = new Onlydistance().new Monk("Monk", 1, 6);
        
        Distance.Sniper sniper = new Distance().new Sniper("Sniper", 5, 1);
        Distance.Crossbowman crossbowman = new Distance().new Crossbowman("Crossbowman", 5, 6);

        Melee.Rogue rogue = new Melee().new Rogue("Rogue", 3, 2);
        Melee.Spearman spearman = new Melee(). new Spearman("Spearman", 3, 5);

        Porter.Peasant peasant = new Porter().new Peasant("Peasant", 0, 0);

        System.out.println(mage.getInfo());
        System.out.println(mage.getInfo1());

        System.out.println(monk.getInfo());
        System.out.println(monk.getInfo1());
 
        System.out.println(sniper.getInfo());
        System.out.println(sniper.getInfo1());

        System.out.println(crossbowman.getInfo());
        System.out.println(crossbowman.getInfo1());

        System.out.println(rogue.getInfo());
        System.out.println(rogue.getInfo1());

        System.out.println(spearman.getInfo());
        System.out.println(spearman.getInfo1());

        System.out.println(peasant.getInfo());
        System.out.println(peasant.getInfo1());
        System.out.println();

        // Porter Peasant = new Porter(getName());

        // ArrayList<Porter> list = new ArrayList<>();
        // list.add(new Peasant(getName()));
        // list.get(0).getInfo();

        System.out.println("Your team1");
        int teamCount = 3;
        Random rand = new Random();
        ArrayList<Units> team1 = new ArrayList<>();
        for (int i = 0; i <= teamCount; i++) {
            int val = rand.nextInt(4);
            switch (val){
                case 0 -> team1.add(new Onlydistance().new Mage("Mage", 1,1));
                case 1 -> team1.add(new Distance().new Sniper("Sniper", 5, 1));
                case 2 -> team1.add(new Melee().new Rogue("Rogue", 3, 2));
                case 3 -> team1.add(new Porter().new Peasant("Peasant", 3, 1));
            }
            System.out.println(team1.get(i).getInfo());
        }
        
        System.out.println("\nYour team2");

        ArrayList<Units> team2 = new ArrayList<>();
        for (int i = 0; i <= teamCount; i++) {
            int val = rand.nextInt(4);
            switch (val){
                case 0 -> team2.add(new Onlydistance().new Monk("Monk", 1, 6));
                case 1 -> team2.add(new Distance().new Crossbowman("Crossbowman", 5, 6));
                case 2 -> team2.add(new Melee().new Spearman("Spearman", 3, 5));
                case 3 -> team2.add(new Porter().new Peasant("Peasant", 3, 6));
            }
            System.out.println(team2.get(i).getInfo());
        }
        

        System.out.println("\nThe nearset1");
        team1.forEach(n -> n.step(team2));

        System.out.println("\nThe nearset2");
        team2.forEach(n -> n.step(team1));
        

    }

    private static String getName(){
        String s = String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
        return s;
    }

}



