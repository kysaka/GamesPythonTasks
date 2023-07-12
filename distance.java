import java.util.ArrayList;
import java.util.Random;

public class Distance {

    public class Sniper extends Units {

        private int ammunition;

        // private int maxStamina;
        // private int stamina;

        public Sniper(String name, int x, int y) {
            super("Sniper", 150, 20, 50, 70, 5, 1, x, y);
            this.ammunition = 50;
        }

        // public void attack(Units target) {
        //     int damage = Units.r.nextInt(10, 20);
        //     target.getDamage(damage);
        // }
        
        @Override
        public String getInfo() {
            this.hp = (150);
            this.energy = Units.r.nextInt(50, 100);
            return String.format("%s  Stamina: %d", super.getInfo(), this.energy);
        }


        @Override
        public String getInfo1() {
            String s = String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
            return "Sniper " + s;
        }

        @Override
        public void step(ArrayList<Units> units){
            Units tmp = nearest(units); 
            System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
            
            // if (getStrength() == 0 || ammunition == 0 ) {
            //     return;                
            // }
            // Units currentEnemy = findClosestEnemy(list);
            // doAttack(currentEnemy);

            // if (list2.contains(Porter.class)) {
            //     return;
            // }
            // ammunition --;
        }

        public int usAmmunitions(){
            ammunition -= 1;
            return ammunition;
        }
    }

    public class Crossbowman extends Units {

        private int ammunition;

        // private int maxStamina;
        // private int stamina; 

        public Crossbowman(String name, int x, int y) {
            super("Crossbowman", 150, 20, 50, 70, 5, 1, x, y);
        }

        public void attack(Units target) {
            int damage = Units.r.nextInt(10, 20);
            target.getDamage(damage);
        }
        
        @Override
        public String getInfo() {
            this.hp = (150);
            this.energy = Units.r.nextInt(70, 120);
            String s = String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
            return "Crossbowman  " + s;
        }

        @Override
        public void step(ArrayList<Units> units){
            Units tmp = nearest(units); 
            System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
            
            // if (getStrength() == 0 || ammunition == 0 ) {
            //     return;                
            // }
            // Units currentEnemy = findClosestEnemy(list);
            // doAttack(currentEnemy);

            // if (list2.contains(Porter.class)) {
            //     return;
            // }
            // ammunition --;        
        }

        public int usAmmunitions(){
            ammunition -=1;
            return ammunition;
        }       
    }
}