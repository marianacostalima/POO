public class Exemplo {
    public static void main(String[] args) {
        // Instanciando um objeto da classe Carro e fornecendo os parâmetros ao construtor
        Carro carro1 = new Carro("Toyota", "Corolla", 2022, 4);
        
        // Chamando o método exibirDetalhes do objeto Carro para exibir informações
        carro1.exibirDetalhes();
        System.out.println();

        // Instanciando um objeto da classe Moto e fornecendo os parâmetros ao construtor
        Moto moto1 = new Moto("Yamaha", "XT66OR", 2019, 500);
        
        // Chamando o método exibirDetalhes do objeto Moto para mostrar detalhes
        moto1.exibirDetalhes();
    }
}
