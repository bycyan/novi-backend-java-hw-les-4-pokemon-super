public class WaterPokemon extends Pokemon{
    String attackName;
    int waterNum;


    public WaterPokemon(String name, int level, int hp, int attackDamage, String attackName, int waterNum) {
        super(name, level, hp, attackDamage);
        this.attackName = attackName;
        this.waterNum = waterNum;
    }
    @Override
    public void chooseYou() {
        System.out.println(super.getName() + " I choose you!.");
    }
}
