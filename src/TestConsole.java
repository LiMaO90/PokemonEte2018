public class TestConsole {
    public static void main(String[] args) {
        /*
        boolean matchFin = false;
        int indiceCapacite;
        int indiceMenu;
        while(!matchFin){
            System.out.println("Entrez 1 pour attaquer avec " + tabpokemon[0].getNom());
            System.out.println("ou Entrez 2 pour changer de pokémon :");
            indiceMenu = input.nextInt();
            input.nextLine();
            if(indiceMenu == 1){

            }
            else if(indiceMenu == 2){

            }
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
        }
         */

        Dresseur dresseurPerso= new Dresseur("Ash");
        Pokemon pikachu = new Pokemon(Type.normal,"pikachu");
        Pokemon kaiminus = new Pokemon(Type.eau,"kaiminus");
        dresseurPerso.setTabpokemon(0,pikachu);
        dresseurPerso.combattre();


    }
}
