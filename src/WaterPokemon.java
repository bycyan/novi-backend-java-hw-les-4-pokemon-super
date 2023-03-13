public class WaterPokemon extends Pokemon{
    private final String waterAttack;

    public WaterPokemon(String name, int level, int hp, int attackStrength, String waterAttack) {
        super(name, level, hp, attackStrength);
        super.setType("Water");

        this.waterAttack = waterAttack;
    }

    @Override
    public void chooseYou() {
        System.out.println(super.getName() + " I choose you!");
    }

    public String getWaterAttack(){
        return waterAttack;
    }
}
