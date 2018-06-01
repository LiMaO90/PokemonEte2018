public class Dresseur {
    private Pokemon[] tabpokemon;
    private int nbPkemon;
    private String nom;

    public Dresseur(String nom) {
        this.nom = nom;
        nbPkemon = 0;
        tabpokemon = new Pokemon[8];
    }
}
