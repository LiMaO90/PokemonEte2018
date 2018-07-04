import java.util.Scanner;

public class Combat {

    private final Scanner input = new Scanner(System.in);
    private int argentGagne;
    Dresseur dresseurPerso,dresseurAdersaire;

    public Combat(int argentGagne,Dresseur dresseurPerso,Dresseur dresseurAdersaire){
        this.argentGagne=argentGagne;
        this.dresseurPerso=dresseurPerso;
        this.dresseurAdersaire=dresseurAdersaire;
        this.choixAction();
    }

    public int getArgentGagne() {
        return argentGagne;
    }

    public void setArgentGagne(int argentGagne) {
        this.argentGagne = argentGagne;
    }

    public void choixAction(){
        int i = input.nextInt();
        if(i==1) this.combattre();
        if(i==2) this.changerPlacePokemon();
        if(i==3) this.objet();
        if(i==4) this.fuir();
    }

    public void changerPlacePokemon(){
    }

    public void combattre(){}

    public void capturerPokemon(Pokemon pokemon){
        dresseurPerso.setTabpokemon(dresseurPerso.getNbPokemon(),pokemon);
        dresseurPerso.setNbPokemon(dresseurPerso.getNbPokemon()+1);
    }

    public void objet(){}

    public void fuir(){}

}
