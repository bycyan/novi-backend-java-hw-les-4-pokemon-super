import java.util.List;

public class Main {
    public static void main(String[] args){

        //Make new objects of Pokémon (instantiate)
        Pokemon firePokemon = new FirePokemon(
                "Charmeleon",
                30,
                100,
                90,
                "Flamethrower",
                5
                );
        Pokemon elctricPokemon = new ElectricPokemon(
                "Bellibolt",
                32,
                100,
                80,
                "Discharge",
                5
                 );
        Pokemon grassPokemon = new GrassPokemon(
                "Bayleef",
                22,
                100,
                60,
                "Magical Leaf",
                5);
        Pokemon waterPokemon = new WaterPokemon(
                "Poliwhirl",
                48,
                100,
                110,
                "Hydro Pump",
                5);

    }
}
