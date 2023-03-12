public class FirePokemon extends Pokemon {
    String attackName;
    int fireNum;

    public FirePokemon(String name, int level, int hp, int attackDamage, String attackName, int fireNum) {
        super(name, level, hp, attackDamage);
        this.attackName = attackName;
        this.fireNum = fireNum;
    }

    //Attack Method
    public void flameThrower() {
        if (fireNum <= 0) {
            System.out.println(super.getName() + " is out of Flames..");
        } else {
            System.out.println(super.getName() + " attacks with a Flame Thrower!.");
            fireNum--;
        }

    }
}
