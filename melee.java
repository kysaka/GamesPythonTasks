public class Melee {

    public class Rogue extends Units {

        // private int maxStamina;
        // private int stamina;

        public Rogue(String name, int health, int defence, int stamina, int damage, int actionPoints, int initiave) {
            super("Rogue", 100, 30, 50, 100, 5, 2);
            

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
            return String.format("%s  Stamina: %d",super.getInfo(), this.energy);
        }

        @Override
        public void step() {
            throw new UnsupportedOperationException("Unimplemented method 'step'");
        }

    }

    public class Spearman extends Units {

        // private int maxStamina;
        // private int stamina;

        public Spearman(String name, int health, int defence, int stamina, int damage, int actionPoints, int initiave) {
            super("Spearman", 100, 50, 75, 70, 5, 2);
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
            return String.format("%s  Stamina: %d",super.getInfo(), this.energy);
        }

        @Override
        public void step() {
            throw new UnsupportedOperationException("Unimplemented method 'step'");
        }

    }
}