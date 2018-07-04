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

    public void choixAction(){
        int i = input.nextInt();
        if(i==1) combattre();
        if(i==2) changerPlacePokemon();
        if(i==3) objet();
        if(i==4) fuir();
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

    public void objet(){}

    public void fuir(){}

    public Pokemon[] getTabpokemon() {
        return tabpokemon;
    }

    public void setTabpokemon(Pokemon[] tabpokemon) {
        this.tabpokemon = tabpokemon;
    }

    public int getNbPokemon() {
        return nbPokemon;
    }

    public void setNbPokemon(int nbPokemon) {
        this.nbPokemon = nbPokemon;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}