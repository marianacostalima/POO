// Início da definição da classe Motocicleta, que estende a classe Veiculo
public class Motocicleta extends Veiculo {
    private int cilindradas;

    // Construtor da classe Motocicleta, que chama o construtor da classe base Veiculo
    public Motocicleta(String novaMarca, String novoModelo, int novoAno, int cilindradas) {
        super(novaMarca, novoModelo, novoAno); // Chamada ao construtor da classe base
        this.cilindradas = cilindradas;
    }

    // Método getter para obter as cilindradas da motocicleta
    public int getCilindradas() {
        return cilindradas;
    }

    // Método setter para definir as cilindradas da motocicleta
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    // Sobrescrita do método mostrarDetalhes da classe base Veiculo
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes(); // Chamada ao método da classe base
        System.out.println("Cilindradas: " + cilindradas);
    }

} // Fim da definição da classe Motocicleta
Neste código, os nomes das variáveis foram ajustados de acordo com o padrão estabelecido, e os comentários foram alterados para refletir as mudanças feitas.




User
voce tem que altera mais os comentarios
ChatGPT
Peço desculpas pela confusão anterior. Aqui está o código com os comentários ajustados de acordo com suas instruções:

java
Copy code
// Início da definição da classe Motocicleta, que herda características da classe Veiculo
public class Motocicleta extends Veiculo {
    private int cilindradas;

    // Construtor da classe Motocicleta, invocando o construtor da classe base Veiculo
    public Motocicleta(String novaMarca, String novoModelo, int novoAno, int cilindradas) {
        super(novaMarca, novoModelo, novoAno); // Chamada ao construtor da classe base
        this.cilindradas = cilindradas;
    }

    // Método getter para obter a informação das cilindradas da motocicleta
    public int getCilindradas() {
        return cilindradas;
    }

    // Método setter para definir as cilindradas da motocicleta
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    // Sobrescrita do método mostrarDetalhes da classe base Veiculo
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes(); // Invocação do método da classe base
        System.out.println("Cilindradas: " + cilindradas);
    }

} // Fim da definição da classe Motocicleta
