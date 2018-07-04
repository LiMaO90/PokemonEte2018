public class Combat {

    private int argentGagne;
    Dresseur dresseurPerso,dresseurAdersaire;

    public Combat(int argentGagne,Dresseur dresseurPerso,Dresseur dresseurAdersaire){
        this.argentGagne=argentGagne;
        this.dresseurPerso=dresseurPerso;
        this.dresseurAdersaire=dresseurAdersaire;
        dresseurPerso.choixAction();
    }

    public int getArgentGagne() {
        return argentGagne;
    }

    public void setArgentGagne(int argentGagne) {
        this.argentGagne = argentGagne;
    }

}
