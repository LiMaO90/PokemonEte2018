public class Model {
    int pokemon;
    int pokemonRival;

    public Model(){
        pokemonRival = 1 + (int) (Math.random() * ((3 - 1) + 1));
        pokemon = 0;
    }
}
