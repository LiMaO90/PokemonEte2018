public enum Type {
    normal("normal"),
    feu("normal"),
    eau("normal"),
    plante("normal");

    private String name;

    Type(String name) {
        this.name = name;
    }

    public String getType(){
        return this.name;
    }
}
