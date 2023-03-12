public class ElectricPokemon extends Pokemon {
    String attackName;
    int electricNum;


    public ElectricPokemon(String name, int level, int hp, int attackDamage, String attackName, int electricNum) {
        super(name, level, hp, attackDamage);
        this.attackName = attackName;
        this.electricNum = electricNum;
    }

    //Attack Method
    public void discharge() {
        if (electricNum <= 0) {
            System.out.println(super.getName() + " is out of Volts..");
        } else {
            System.out.println(super.getName() + " attacks with a Discharge!.");
            electricNum--;
        }
    }

}
