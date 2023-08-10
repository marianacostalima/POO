// Prog Principal
public class Main {
    public static void main(String[] args) {
      
        // Teste dos métodos implementados
      
        cachorros cachorro1 = new cachorros("lili", "zoe", 3);
        cachorro1.makeSound();
        cachorro1.move();
        System.out.println(cachorro1.getName());
        System.out.println(cachorro1.getAge());
        cachorro1.wagYourTail();

        System.out.println(); // mensagem vazia para auxilar a visualização

        passaros passaro1 = new passaros("Piu-piu", 2, "Amarelo");
        passaro1.makeSound();
        System.out.println(passaro1.getAge());
        System.out.println(passaro1.getName());
        passaro1.fly();
        System.out.println(passaro1.getColor());
        passaro1.buildNest();
    }
}
