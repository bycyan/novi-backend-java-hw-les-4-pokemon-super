public class GrassPokemon extends Pokemon {
    String attackName;
    int grassNum;


    public GrassPokemon(String name, int level, int hp, int attackDamage, String attackName, int grassNum) {
        super(name, level, hp, attackDamage);
        this.attackName = attackName;
        this.grassNum = grassNum;
    }

    @Override
    public void chooseYou() {
        System.out.println(super.getName() + " I choose you!.");
    }

}

