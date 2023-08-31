// Início da definição da classe Automovel, que estende a classe Veiculo
public class Automovel extends Veiculo {
    private int numeroDePortas;

    // Construtor da classe Automovel, que chama o construtor da classe base Veiculo
    public Automovel(String novaMarca, String novoModelo, int novoAno, int numeroDePortas) {
        super(novaMarca, novoModelo, novoAno); // Chamada ao construtor da classe base
        this.numeroDePortas = numeroDePortas;
    }

    // Método getter para obter o número de portas do automóvel
    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    // Método setter para definir o número de portas do automóvel
    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    // Sobrescrita do método mostrarDetalhes da classe base Veiculo
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes(); // Chamada ao método da classe base
        System.out.println("Número de Portas: " + numeroDePortas);
    }

} // Fim da definição da classe Automovel
