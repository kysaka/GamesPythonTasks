import java.util.ArrayList;
import java.util.Random;

public class Melee {

    public class Rogue extends Units {

        // private int maxStamina;
        // private int stamina;

        public Rogue(String name, int health, int defence, int stamina, int damage, int actionPoints, int initiave, int x, int y) {
            super("Rogue", 200, 30, 50, 100, 5, 2, x, y);
            

        }

        public void attack(Units target) {
            int damage = Units.r.nextInt(10, 20);
            target.getDamage(damage);
        }
        
        // public rogue() {
        //     super(String.format("Hero_Rogue #%d", ++rogue.number),
        //             rogue.r.nextInt(100, 200));
        //     this.maxStamina = rogue.r.nextInt(50, 100);
        //     this.stamina = maxStamina;
        // }

        public String getInfo() {
            this.hp = (200);
            return String.format("%s  Stamina: %d",super.getInfo(), this.energy);
        }

        @Override
        public String getInfo1() {
            String s = String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
            return "Peasant " + s;
        }

        @Override
        public void step(ArrayList<Units> units){
            Units tmp = nearest(units); 
            System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
        }

    }

    public class Spearman extends Units {

        // private int maxStamina;
        // private int stamina;

        public Spearman(String name, int health, int defence, int stamina, int damage, int actionPoints, int initiave, int x, int y) {
            super("Spearman", 200, 50, 75, 70, 5, 2, x, y);
        }

        public void attack(Units target) {
            int damage = Units.r.nextInt(10, 20);
            target.getDamage(damage);
        }
        
        // public spearman() {
        //     super(String.format("Hero_Spearman #%d", ++spearman.number),
        //             spearman.r.nextInt(100, 200));
        //     this.maxStamina = spearman.r.nextInt(50, 100);
        //     this.stamina = maxStamina;
        // }

        public String getInfo() {
            this.hp = (200);
            return String.format("%s  Stamina: %d",super.getInfo(), this.energy);
        }

        @Override
        public String getInfo1() {
            String s = String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
            return "Spearman " + s;
        }

        @Override
        public void step(ArrayList<Units> units){
            Units tmp = nearest(units); 
            System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
        }
    }
}