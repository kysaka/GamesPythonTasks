import java.util.ArrayList;
import java.util.Random;

public class Onlydistance {
    
    public class Mage extends Units {

        // private int maxMana;
        // private int mana;
        
        public Mage(String name, int health, int defence, int mana, int damage, int actionPoints, int initiave, int x, int y) {
            super("Mage", 100, 10, 100, 50, 5, 1, x, y);
        }
        
        public void attack(Units target) {
            int damage = Units.r.nextInt(10, 20);
            target.getDamage(damage);
        }
        
        public String getInfo() {
            this.hp = (100);
            this.energy = Units.r.nextInt(100, 200);
            return String.format("%s  Mana: %d", super.getInfo(), this.energy);
        }

        // @Override
        // public void step(ArrayList<Units> units) {
        //     int min;
        //     for (int i = 0; i < units.size(); i++) {
                
        //     }
        // }

        @Override
        public String getInfo1() {
            String s = String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
            return "Mag " + s;
        }

        @Override
        public void step(ArrayList<Units> units){
            Units tmp = nearest(units); 
            System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
        }

    }

    public class Monk extends Units {

        // private int blessing;
        // private int maxBlessing;


        public Monk(String name, int health, int defence, int Blessing, int damage, int actionPoints, int initiave, int x, int y) {
            super("Monk", 100, 10, 100, 50, 5, 1, x, y);
        }
        
        // public void healing(units target) {
        //     int heal = units.r.nextInt(10, 20);
        //     if (this.blessing >= heal) {
        //         target.healed(heal);
        //     }
        // }


        public String getInfo() {
            this.hp = (100);
            this.energy = Units.r.nextInt(100, 200);
            return String.format("%s  Blessing: %d", super.getInfo(), this.energy);
        }

        // @Override
        // public void step(ArrayList<Units> units) {

        // }

        @Override
        public String getInfo1() {
            String s = String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
            return "Monk " + s;
        }

        @Override
        public void step(ArrayList<Units> units){
            Units tmp = nearest(units); 
            System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
        }
        
    }
}
