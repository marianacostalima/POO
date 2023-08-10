// Clas Pássaros (subclasse de Aves)
class passaros extends aves {
    String color;

    // Construtor
    public passaros(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    // met construirNinho()
    public void buildNest() {
        System.out.println("The bird is building a nest.");
    }

}
