public abstract class Pokemon {

    //2 private variables
    String name;
    int level;
    int hp;
    int attackDamage;

    //Constructor
    public Pokemon(String name, int level, int hp, int attackDamage) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.attackDamage = attackDamage;
    }

    //Methods

    //Pokemon attack
    public void attack(){
        System.out.println(name + " performs attack");
    }

    //Pokémon level up
    public void levelUp(){
        this.level++;
        System.out.println("Congratulations, " + name + " has now reached level " + level);
    }

    //getters & setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp(){
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack(int attack) {
        return attack;
    }
    public void setAttack (int attack){

    }
}
