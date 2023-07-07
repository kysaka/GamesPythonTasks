public class Onlydistance {
    
    public class Mage extends Units {

        // private int maxMana;
        // private int mana;
        
        public Mage(String name, int health, int defence, int blessing, int healing, int actionPoints, int initiave) {
            super("Mage", 100, 10, 100, 50, 5, 1);
        }
        
        public void attack(Units target) {
            int damage = Units.r.nextInt(10, 20);
            target.getDamage(damage);
        }
        
        public String getInfo() {
            this.energy = Units.r.nextInt(100, 200);
            return String.format("%s  Mana: %d", super.getInfo(), this.energy);
        }

        @Override
        public void step() {
            throw new UnsupportedOperationException("Unimplemented method 'step'");
        }

    }

    public class Monk extends Units {

        // private int blessing;
        // private int maxBlessing;


        public Monk(String name, int health, int defence, int mana, int healing, int actionPoints, int initiave) {
            super("Monk", 100, 10, 100, 50, 5, 1);
        }
        
        // public void healing(units target) {
        //     int heal = units.r.nextInt(10, 20);
        //     if (this.blessing >= heal) {
        //         target.healed(heal);
        //     }
        // }


        public String getInfo() {
            this.energy = Units.r.nextInt(100, 200);
            return String.format("%s  Blessing: %d", super.getInfo(), this.energy);
        }

        @Override
        public void step() {
            throw new UnsupportedOperationException("Unimplemented method 'step'");
        }
        
    }
}
