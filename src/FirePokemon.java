public class FirePokemon extends Pokemon {
    private final String fireAttack;

    public FirePokemon(String name, int level, int hp, int attackStrength, String fireAttack) {
        super(name, level, hp, attackStrength);
        super.setType("Fire");

        this.fireAttack = fireAttack;
    }

    @Override
    public void chooseYou() {
        System.out.println(super.getName() + " I choose you!.");
    }

    public String getFireAttack(){
        return fireAttack;
    }
}
