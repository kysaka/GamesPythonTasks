import java.util.Random;

public abstract class units {

    protected static int number;
    protected static Random r;

    protected String name;
    protected int hp;
    protected int maxHp;

    static {
        units.number = 0;
        units.r = new Random();
    }
    
    public units(String name, int hp) {
        this.name = name;
        this.hp = this.maxHp = 100;
    }
    
    public units() {
        this(String.format("Hero_Units #%d", ++units.number),
        units.r.nextInt(100, 200));
    }
    
    public String getInfo() {
        this.hp = units.r.nextInt(100, 150);
        return String.format("Name: %s  Hp: %d  Type: %s", 
                this.name, this.hp, this.getClass().getSimpleName());
    }
    
    
    protected void healed(int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }
    
    protected void getDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
    }
    
    public int health;


    public int defence;

    public int energy;

    public int damage;


    public int actionPoints;
    
    public boolean hasAP(){
        if (actionPoints > 0){
            return true;
        } else return false;
    } 

    public int initiave;

    public units (String name, int health, int defence, int energy, int damage, int actionPoints, int initiave){
        this.name = name;
        this.health = health;
        this.defence = defence;
        this.energy = energy;
        this.damage = damage;
        this.actionPoints = actionPoints;
        this.initiave = initiave;
    }

}