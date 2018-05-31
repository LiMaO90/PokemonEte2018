public class Capacity {
    private String nom;
    private int PP;
    private Type type;
    private int pouvoir;

    public Capacity(String nom, int PP, Type type, int pouvoir) {
        this.nom = nom;
        this.PP = PP;
        this.type = type;
        this.pouvoir = pouvoir;
    }

    public Capacity() {}

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPP(int PP) {
        this.PP = PP;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setPouvoir(int pouvoir) {
        this.pouvoir = pouvoir;
    }

    public String getNom() {
        return nom;
    }

    public int getPP() {
        return PP;
    }

    public Type getType() {
        return type;
    }

    public int getPouvoir() {
        return pouvoir;
    }

    @Override
    public String toString() {
        return "nom='" + nom;
    }
}
