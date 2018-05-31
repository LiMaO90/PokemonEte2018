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

    public void perduPV(int pvPerdu){
        this.pv = this.pv - pvPerdu;
    }
}
