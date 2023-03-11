public abstract class Pokemon {

    //2 private variables
    String name;
    int level;
    int hp;

    //1 constructor
    public Pokemon(String name, int level, int hp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
    }

    //2 methods

    public void attack(){
        System.out.println(name + " performs attack");
    }

    public void levelUp(){
        this.level++;
        System.out.println("Congratulations, " + name + " has now reached level " + level);
    }


    //2 getters

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    //2 setters

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }


}
