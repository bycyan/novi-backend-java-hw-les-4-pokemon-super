public class ElectricPokemon extends Pokemon {
    private final String electricAttack;

    public ElectricPokemon(String name, int level, int hp, int attackStrength, String electricAttack) {
        super(name, level, hp, attackStrength);
        super.setType("Electric");

        this.electricAttack = electricAttack;
    }

    @Override
    public void chooseYou() {
        System.out.println(super.getName() + " I choose you!");
    }

    public String getElectricAttack(){
        return electricAttack;
    }


}
