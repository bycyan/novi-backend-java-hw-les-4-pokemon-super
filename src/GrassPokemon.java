public class GrassPokemon extends Pokemon {
    String attackName;
    int grassNum;


    public GrassPokemon(String name, int level, int hp, int attackDamage, String attackName, int grassNum) {
        super(name, level, hp, attackDamage);
        this.attackName = attackName;
        this.grassNum = grassNum;
    }

    //Attack Method
    public void magicalLeaf() {
        if (grassNum <= 0) {
            System.out.println(super.getName() + " is out of Grass..");
        } else {
            System.out.println(super.getName() + " attacks with a Magical Leaf!.");
            grassNum--;
        }
    }
}
