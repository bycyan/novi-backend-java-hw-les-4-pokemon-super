public class FirePokemon extends Pokemon{
    String eats;
    private String attack;

    public FirePokemon(String name, int level, int hp, String eats, String attack) {
        super(name, level, hp);
        this.eats = eats;
        this.attack = attack;

    }
    void inferno(){
        System.out.println(super.getName() + attack);
    }

    public void flameThrower(){
        System.out.println(super.getName() + " shoots a massive " + attack + " flame at its opponent.");
    }
}
