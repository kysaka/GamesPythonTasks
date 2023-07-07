public class onlydistance {
    
    public class Mage extends units {

        private int maxMana;
        private int mana;
        
        public Mage(String name, int health, int defence, int blessing, int healing, int actionPoints, int initiave) {
            super("Mage", 100, 10, 100, 50, 5, 1);
        }
        
        public void attack(units target) {
            int damage = units.r.nextInt(10, 20);
            target.getDamage(damage);
        }
        
        public Mage() {
            super(String.format("Hero_Magician #%d", ++Mage.number),
                    Mage.r.nextInt(100, 200));
            this.maxMana = Mage.r.nextInt(50, 100);
            this.mana = maxMana;
        }

        public String getInfo() {
            return String.format("%s  Mana: %d",super.getInfo(), this.mana);

        }

    }

    public class Monk extends units {

        private int blessing;
        private int maxBlessing;


        public Monk(String name, int health, int defence, int mana, int healing, int actionPoints, int initiave) {
            super("Monk", 100, 10, 100, 50, 5, 1);
        }
        
        public void healing(units target) {
            int heal = units.r.nextInt(10, 20);
            if (this.blessing >= heal) {
                target.healed(heal);
            }
        }
        
        public Monk() {
            super(String.format("Hero_Monk #%d", ++Monk.number),
                    Mage.r.nextInt(100, 200));
            this.maxBlessing = Mage.r.nextInt(50, 100);
            this.blessing = maxBlessing;
        }


        public String getInfo() {
            return String.format("%s  Blessing: %d", super.getInfo(), this.blessing);
        }

    }
}
