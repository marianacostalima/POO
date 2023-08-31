public class Veiculo {
    private String marcaNova;
    private String modeloNovo;
    private int anoNovo;
    
    // Construtor da classe Veiculo
    public Veiculo(String novaMarca, String novoModelo, int novoAno) {
        this.marcaNova = novaMarca;
        this.modeloNovo = novoModelo;
        this.anoNovo = novoAno;
    }
    
    // Método getter para obter a marca do veículo
    public String getMarcaNova() {
        return marcaNova;
    }
    
    // Método setter para definir a marca do veículo
    public void setMarcaNova(String novaMarca) {
        this.marcaNova = novaMarca;
    }
    
    // Método getter para obter o modelo do veículo
    public String getModeloNovo() {
        return modeloNovo;
    }
    
    // Método setter para definir o modelo do veículo
    public void setModeloNovo(String novoModelo) {
        this.modeloNovo = novoModelo;
    }
    
    // Método getter para obter o ano do veículo
    public int getAnoNovo() {
        return anoNovo;
    }
    
    // Método setter para definir o ano do veículo
    public void setAnoNovo(int novoAno) {
        this.anoNovo = novoAno;
    }

    // Método para mostrar os detalhes do veículo, incluindo marca, modelo e ano
    public void mostrarDetalhes() {
        System.out.println("Marca: " + marcaNova);
        System.out.println("Modelo: " + modeloNovo);
        System.out.println("Ano: " + anoNovo);
    }
}
