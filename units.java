import java.util.ArrayList;
import java.util.Random;

public abstract class Units implements InGameInterface {

    protected static int number;
    protected static Random r;

    protected String name; 
    
    protected int hp; // здоровье  
    protected int maxHp; // макс. здоровье

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
    
    
    protected int health; // лечение 
    
    protected void healed(int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    protected int defence; // защита
    
    protected int energy; // стамина, мана 

    protected int strength; // сила 

    public int getStrength(){
        return strength;
    }
    
    protected int attack; // атака
    
    public void doAttack(Units target){
        int damage = 50;
        target.getDamage(damage);
    }
    
    protected int damage; // урон
    
    public void getDamage(){
        if(this.health - damage > 0){
            this.health -= damage; 
        }
        else {
            this.health = 0;
        }
    }

    protected int actionPoints;
    
    public boolean hasAP(){
        if (actionPoints > 0){
            return true;
        } else return false;
    } 

    protected int initiave;
    
    protected Coordinates coordinates;
    
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

    public Units findClosestEnemy(ArrayList<Units> list){
        double max = 1000;
        int index = 0;

        for (int i = 0; i < list.size(); i++) {
            if (coordinates.countDistance(list.get(i).coordinates) < max) {
                max = coordinates.countDistance(list.get(i).coordinates);
                index = i;
            }
        }
        // System.out.println("Fithe " + list.get(index).name + " " + "index " + index + " " + "melle " );
        return list.get(index);
    }



    protected static class Coord {
        private int x;
        private int y;


        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

}