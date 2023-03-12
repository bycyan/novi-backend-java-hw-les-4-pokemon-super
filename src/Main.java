import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //Make new objects of Pokémon (instantiate)
        FirePokemon firePokemon = new FirePokemon(
                "Charmeleon",
                30,
                100,
                90,
                "Flame Thrower"
                );
        ElectricPokemon electricPokemon = new ElectricPokemon(
                "Bellibolt",
                32,
                100,
                80,
                "Discharge"
                 );
//        Pokemon grassPokemon = new GrassPokemon(
//                "Bayleef",
//                22,
//                100,
//                60,
//                "Magical Leaf",
//                5);
//        Pokemon waterPokemon = new WaterPokemon(
//                "Poliwhirl",
//                48,
//                100,
//                110,
//                "Hydro Pump",
//                5);

        //Fire Pokemon
        System.out.println();
        firePokemon.chooseYou();
        firePokemon.statusLine();

        System.out.println(firePokemon.getName()+" attacks with a " + firePokemon.getFireAttack()+" that gives a damage of "+firePokemon.getAttackStrength());

        //Electric Pokemon
        System.out.println();
        electricPokemon.chooseYou();
        electricPokemon.statusLine();

        System.out.println(electricPokemon.getName()+" attacks with a " + electricPokemon.getElectricAttack()+" that gives a damage of "+firePokemon.getAttackStrength());
        electricPokemon.levelUp();



    }
}
