// Início da definição da classe Carro, que herda características da classe Veiculo
public class Carro extends Veiculo {
    private int numeroDePortas;
    
    // Construtor da classe Carro, invocando o construtor da classe base Veiculo
    public Carro(String novaMarca, String novoModelo, int novoAno, int numeroDePortas) {
        super(novaMarca, novoModelo, novoAno); // Chamada ao construtor da classe base
        this.numeroDePortas = numeroDePortas;
    }
    
    // Método getter para obter o número de portas do carro
    public int getNumeroDePortas() {
        return numeroDePortas;
    }
    
    // Método setter para definir o número de portas do carro
    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    // Sobrescrita do método mostrarDetalhes da classe base Veiculo
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes(); // Invocação do método da classe base
        System.out.println("Número de Portas: " + numeroDePortas);
    }
    
} // Fim da definição da classe Carro
