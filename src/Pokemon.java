import java.util.Scanner;

public class Pokemon {
    private final Scanner input = new Scanner(System.in);
    private int nbCapacity;
    private Capacity[] tabCapacite;
    private Type type;
    private String nom;
    private int pv;

    public Pokemon(Type type, String nom) {
        nbCapacity = 0;
        pv = 100;
        tabCapacite = new Capacity[4];
        this.type = type;
        this.nom = nom;
    }

    public Pokemon() {
        pv = 100;
        nbCapacity = 0;
        tabCapacite = new Capacity[4];
    }

    public String getNom() {
        return nom;
    }
    public Type getType() {
        return type;
    }
    public int getPv() {
        return pv;
    }

    public void addCapacity(Capacity capacity){
        int nbCapacite;
        Boolean estPasse = true;
        if(nbCapacity >= 4){
            System.out.println("Plus de place pour capacite, choisir la capacite a changer : ");
            while(!estPasse) {
                for (int i = 0; i < nbCapacity; i++) {
                    System.out.println("- " + i + 1 + " pour changer " + tabCapacite[i]);
                }
                nbCapacite = input.nextInt();
                input.nextLine();
                if( 0 < nbCapacite && nbCapacite < 5 ){
                    tabCapacite[nbCapacite-1] = capacity;
                    estPasse = false;
                }
            }
        }
        else{
            tabCapacite[nbCapacity] = capacity;
            nbCapacity++;
        }
    }

    public void attaquer(int indiceCapacity, Pokemon pokemon) {
        if(tabCapacite[indiceCapacity].getPP()<=0) {
            if (tabCapacite[indiceCapacity].getType().equals(Type.feu)) {
                switch (pokemon.getType().getType()) {
                    case "plante":
                        pokemon.perduPV(tabCapacite[indiceCapacity].getPouvoir() * 2);
                        break;
                    case "eau":
                        pokemon.perduPV(tabCapacite[indiceCapacity].getPouvoir() / 2);
                        break;
                    default:
                        pokemon.perduPV(tabCapacite[indiceCapacity].getPouvoir());
                }
            } else if (tabCapacite[indiceCapacity].getType().equals(Type.eau)) {
                switch (pokemon.getType().getType()) {
                    case "feu":
                        pokemon.perduPV(tabCapacite[indiceCapacity].getPouvoir() * 2);
                        break;
                    case "plante":
                        pokemon.perduPV(tabCapacite[indiceCapacity].getPouvoir() / 2);
                        break;
                    default:
                        pokemon.perduPV(tabCapacite[indiceCapacity].getPouvoir());
                }
            } else if (tabCapacite[indiceCapacity].getType().equals(Type.plante)) {
                switch (pokemon.getType().getType()) {
                    case "eau":
                        pokemon.perduPV(tabCapacite[indiceCapacity].getPouvoir() * 2);
                        break;
                    case "feu":
                        pokemon.perduPV(tabCapacite[indiceCapacity].getPouvoir() / 2);
                        break;
                    default:
                        pokemon.perduPV(tabCapacite[indiceCapacity].getPouvoir());
                }
            } else
                pokemon.perduPV(tabCapacite[indiceCapacity].getPouvoir());
            tabCapacite[indiceCapacity].utiliser();
        }
        else
            System.out.println("Plus de PP");
    }

    public void perduPV(int pvPerdu){
        this.pv = this.pv - pvPerdu;
    }
}
