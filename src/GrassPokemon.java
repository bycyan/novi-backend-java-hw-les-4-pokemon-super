public class GrassPokemon extends Pokemon {
    private final String grassAttack;

    public GrassPokemon(String name, int level, int hp, int attackStrength, String grassAttack) {
        super(name, level, hp, attackStrength);
        super.setType("Grass");

        this.grassAttack = grassAttack;
    }

    @Override
    public void chooseYou() {
        System.out.println(super.getName() + " I choose you!");
    }

    public String getGrassAttack(){
        return grassAttack;
    }
}

