// Clas Aves
public class aves {
    String name;
    int age;

    // Construtor
    public aves(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Met emitirSom
    public void makeSound() {
        System.out.println("bird sound");
    }

    public String getName(){
        return name;
    }

    public int getAge(){
            return age;
        }

    // Met voar
    public void fly() {
        System.out.println("bird flying");
    }
}
