import java.util.Scanner;

public class Dresseur {
    private final Scanner input = new Scanner(System.in);
    private Pokemon[] tabpokemon;
    private int nbPokemon;
    private String nom;

    public Dresseur(String nom) {
        this.nom = nom;
        nbPokemon = 0;
        tabpokemon = new Pokemon[6];
    }

    public void capturerPokemon(Pokemon pokemon){
        tabpokemon[nbPokemon] = pokemon;
        nbPokemon++;
    }

    public void changerPlacePokemon(int indicePokemon1, int indicePokemon2){
        Pokemon tmp = tabpokemon[indicePokemon1];
        tabpokemon[indicePokemon1] = tabpokemon[indicePokemon2];
        tabpokemon[indicePokemon2] = tmp;
    }

    public void changerPlacePokemon(){
    }

    public void combattre(){

    }
}
