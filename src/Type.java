public enum Type {
    normal("normal"),
    feu("feu"),
    eau("eau"),
    plante("plante");

    private String name;

    Type(String name) {
        this.name = name;
    }

    public String getType(){
        return this.name;
    }
}
