public class Model {
    private int pokemon;
    private int pokemonRival;

    public Model(){
        pokemonRival = 0;
        pokemon = 0;
    }

    public int getPokemon() {
        return pokemon;
    }
    public int getPokemonRival() {
        return pokemonRival;
    }

    public void setPokemon(int pokemon) {
        this.pokemon = pokemon;
    }
    public void setPokemonRival(int pokemonRival) {
        this.pokemonRival = pokemonRival;
    }
}
