import java.util.ArrayList;
import java.util.Random;

public class Porter {
    
   public class Peasant extends Units {

        public Peasant(String name, int health, int defence, int stamina, int damage, int actionPoints, int initiave, int x, int y) {
            super("Peasant", 50, 10, 10, 20, 2, 1, x, y);
        }

        public Peasant(String name) {
            this.name = name;
        }

        public String getInfo() {
            this.hp = (50);
            return String.format("%s  Stamina: %d",super.getInfo(), this.energy);
        }

        @Override
        public String getInfo1() {
            String s = String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
            return "Peasant " + s;
        }

        public void attack(Units target) {
            int damage = Units.r.nextInt(1, 10);
            target.getDamage(damage);
        }

        @Override
        public void step(ArrayList<Units> units){
            Units tmp = nearest(units); 
            System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
        }

    }
}
