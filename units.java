import java.util.ArrayList;
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
        return String.format("Name: %s  Hp: %d  Type: %s X:%d Y:%d", this.name, this.hp, this.getClass().getSimpleName(), this.coordinates.x, this.coordinates.y);
    }
    
    
    protected void healed(int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }
    
    protected void getDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
    }
    
    public Units nearest (ArrayList<Units> units) {
        double nearestDistance = Double.MAX_VALUE;
        Units nearestEnemy = null;
        for (int i = 0; i < units.size(); i++) {
            if(coordinates.countDistance(units.get(i).coordinates) < nearestDistance){
                nearestEnemy = units.get(i);
                nearestDistance = coordinates.countDistance(units.get(i).coordinates);
            }
        }
        return nearestEnemy;
    }
    
    @Override
    public void step(ArrayList<Units> units){

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
    
    Coordinates coordinates;
    
    public Units (String name, int health, int defence, int energy, int damage, int actionPoints, int initiave, int x, int y){
        this.name = name;
        this.health = health;
        this.defence = defence;
        this.energy = energy;
        this.damage = damage;
        this.actionPoints = actionPoints;
        this.initiave = initiave;
        coordinates = new Coordinates(x, y);
    }

    public int getX() {
        return 0;
    }

    public int getY() {
        return 0;
    }

    public String getName() {
        return null;
    }

    public void setX(int i) {
    }

    public void setY(int i) {
    }
}