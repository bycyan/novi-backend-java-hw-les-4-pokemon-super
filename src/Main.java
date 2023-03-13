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
        GrassPokemon grassPokemon = new GrassPokemon(
                "Bayleef",
                22,
                100,
                60,
                "Magical Leaf"
        );
        WaterPokemon waterPokemon = new WaterPokemon(
                "Poliwhirl",
                48,
                100,
                110,
                "Hydro Pump"
        );

        prompt();

        //Fire Pokemon
        System.out.println();
        firePokemon.chooseYou();
        firePokemon.statusLine();
        System.out.println(firePokemon.getName()+" attacks with a " + firePokemon.getFireAttack()+" that gives a damage of "+firePokemon.getAttackStrength());
        firePokemon.levelUp();
        System.out.println();
        prompt();

        //Electric Pokemon
        System.out.println();
        electricPokemon.chooseYou();
        electricPokemon.statusLine();
        System.out.println(electricPokemon.getName()+" attacks with a " + electricPokemon.getElectricAttack()+" that gives a damage of "+firePokemon.getAttackStrength());
        electricPokemon.levelUp();
        System.out.println();
        prompt();

        //Grass Pokemon
        System.out.println();
        grassPokemon.chooseYou();
        grassPokemon.statusLine();
        System.out.println(grassPokemon.getName()+" attacks with a " + grassPokemon.getGrassAttack() + " that gives a damage of "+grassPokemon.getAttackStrength());
        grassPokemon.levelUp();
        System.out.println();
        prompt();

        //Water Pokemon
        System.out.println();
        waterPokemon.chooseYou();
        waterPokemon.statusLine();
        System.out.println(waterPokemon.getName()+" attacks with a " + waterPokemon.getWaterAttack() + " that gives a damage of "+waterPokemon.getAttackStrength());
        waterPokemon.levelUp();
        System.out.println();
        prompt();

        System.out.println("                                  ,'\\\n" +
                "    _.----.        ____         ,'  _\\   ___    ___     ____\n" +
                "_,-'       `.     |    |  /`.   \\,-'    |   \\  /   |   |    \\  |`.\n" +
                "\\      __    \\    '-.  | /   `.  ___    |    \\/    |   '-.   \\ |  |\n" +
                " \\.    \\ \\   |  __  |  |/    ,','_  `.  |          | __  |    \\|  |\n" +
                "   \\    \\/   /,' _`.|      ,' / / / /   |          ,' _`.|     |  |\n" +
                "    \\     ,-'/  /   \\    ,'   | \\/ / ,`.|         /  /   \\  |     |\n" +
                "     \\    \\ |   \\_/  |   `-.  \\    `'  /|  |    ||   \\_/  | |\\    |\n" +
                "      \\    \\ \\      /       `-.`.___,-' |  |\\  /| \\      /  | |   |\n" +
                "       \\    \\ `.__,'|  |`-._    `|      |__| \\/ |  `.__,'|  | |   |\n" +
                "        \\_.-'       |__|    `-._ |              '-.|     '-.| |   |\n" +
                "                                `'                            '-._|");



    }

    private static void prompt() {
        Scanner keyIn = new Scanner(System.in);

        System.out.print("To attack with your Pokémon press: ENTER");
        keyIn.nextLine();
    }
}
