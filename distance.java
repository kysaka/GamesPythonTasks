public class distance {

    public class Sniper extends units {

        // private int maxStamina;
        // private int stamina;

        public Sniper(String name, int health, int defence, int stamina, int damage, int actionPoints, int initiave) {
            super("Sniper", 100, 20, 50, 70, 5, 1);
        }

        public void attack(units target) {
            int damage = units.r.nextInt(10, 20);
            target.getDamage(damage);
        }
        
        public String getInfo() {
            this.energy = units.r.nextInt(50, 100);
            return String.format("%s  Stamina: %d", super.getInfo(), this.energy);
        }
    }

    public class Crossbowman extends units {

        // private int maxStamina;
        // private int stamina; 

        public Crossbowman(String name, int health, int defence, int stamina, int damage, int actionPoints, int initiave) {
            super("Crossbowman", 100, 20, 50, 70, 5, 1);
        }

        public void attack(units target) {
            int damage = units.r.nextInt(10, 20);
            target.getDamage(damage);
        }
        
        public String getInfo() {
            this.energy = units.r.nextInt(70, 120);
            return String.format("%s  Stamina: %d", super.getInfo(), this.energy);
        }

    }
}
