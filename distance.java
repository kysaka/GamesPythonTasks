public class distance {

    public class sniper extends units {

        private int maxStamina;
        private int stamina;

        public sniper(String name, int health, int defence, int stamina, int damage, int actionPoints, int initiave) {
            super("Sniper", 100, 20, 50, 70, 5, 1);
        }

        public void attack(units target) {
            int damage = units.r.nextInt(10, 20);
            target.getDamage(damage);
        }
        
        public sniper() {
            super(String.format("Hero_Sniper #%d", ++sniper.number),
                    sniper.r.nextInt(100, 200));
            this.maxStamina = sniper.r.nextInt(50, 100);
            this.stamina = maxStamina;
        }

        public String getInfo() {
            return String.format("%s  Stamina: %d",super.getInfo(), this.stamina);
        }
    }

    public class crossbowman extends units {

        private int maxStamina;
        private int stamina;

        public crossbowman(String name, int health, int defence, int stamina, int damage, int actionPoints, int initiave) {
            super("Crossbowman", 100, 20, 50, 70, 5, 1);
        }

        public void attack(units target) {
            int damage = units.r.nextInt(10, 20);
            target.getDamage(damage);
        }
        
        public crossbowman() {
            super(String.format("Hero_Crossbowman #%d", ++crossbowman.number),
                    sniper.r.nextInt(100, 200));
            this.maxStamina = sniper.r.nextInt(50, 100);
            this.stamina = maxStamina;
        }

        public String getInfo() {
            return String.format("%s  Stamina: %d",super.getInfo(), this.stamina);
        }

    }
}
