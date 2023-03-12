public class WaterPokemon extends Pokemon{
    String attackName;
    int waterNum;


    public WaterPokemon(String name, int level, int hp, int attackDamage, String attackName, int waterNum) {
        super(name, level, hp, attackDamage);
        this.attackName = attackName;
        this.waterNum = waterNum;
    }

    //Attack Method
    public void hydroPump(){
        if(waterNum <= 0){
            System.out.println(super.getName() + " is out of Water..");
        } else {
            System.out.println(super.getName() + " attacks with a Hydro Pump!.");
            waterNum--;
        }
    }
}
