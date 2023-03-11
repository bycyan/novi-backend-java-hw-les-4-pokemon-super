import java.util.List;

public class Main {
    public static void main(String[] args){

        //Make new objects of Pokemon (instantiate)
        Pokemon firePokemon = new FirePokemon("Pickachu", 20, 30, "fireflies", "flame throwers");
        Pokemon elctricPokemon = new ElectricPokemon(20, 30, "Tesla batteries");
        Pokemon grassPokemon = new GrassPokemon(50, 40, "Oak leaves");
        Pokemon waterPokemon = new WaterPokemon(120, 40, "Spaghetti shrimp");

        System.out.println(firePokemon);

    }
}
