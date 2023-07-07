import java.util.Random;

public abstract class Units implements InGameInterface {

    protected static int number;
    protected static Random r;

    protected String name;
    
    protected int hp;
    protected int maxHp;

    static {
        Units.number = 0;
        Units.r = new Random();
    }
    
    protected Units(String name, int hp) {
        this.name = name;
        this.hp = this.maxHp;
    }

    @Override
    public String getInfo1() {
        String s = String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
        return s;
    }
    
    public Units() {
        this(String.format("Hero_Units #%d", ++Units.number),
        Units.r.nextInt(100, 200));
    }
    
    public String getInfo() {
        this.hp = Units.r.nextInt(100, 150);
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
    
    protected int health;

    protected int defence;

    protected int energy;

    protected int damage;

    protected int actionPoints;
    
    public boolean hasAP(){
        if (actionPoints > 0){
            return true;
        } else return false;
    } 

    protected int initiave;

    public Units (String name, int health, int defence, int energy, int damage, int actionPoints, int initiave){
        this.name = name;
        this.health = health;
        this.defence = defence;
        this.energy = energy;
        this.damage = damage;
        this.actionPoints = actionPoints;
        this.initiave = initiave;
    }

}