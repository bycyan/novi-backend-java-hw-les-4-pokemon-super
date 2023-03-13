public abstract class Pokemon {

    //Variables
    private final String name;
    private int level;
    private final int hp;
    int attackStrength;
    private String type;

    //Constructor
    public Pokemon(String name, int level, int hp, int attackStrength) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.attackStrength = attackStrength;
    }

    public abstract void chooseYou();

    //levelUp Method
    public void levelUp(){
        this.level++;
        System.out.println("Congratulations, " + name + " has now reached level " + level);
    }

    //Pokemon statusLine Method
    public void statusLine(){
        System.out.println("This "+ getType()+" Pokémon of level "+getLevel()+" has "+getHp()+" hp left.");
    }

    //Getters & Setters
    public String getName() {
        return name;
    }
    public int getLevel() {
        return level;
    }
    public int getAttackStrength(){
        return attackStrength;
    }
    public int getHp(){
        return hp;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

}
