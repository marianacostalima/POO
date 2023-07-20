public class Emprestimo { 
  
    //atributos publicos 
    public double valorTotal;
    public double taxaJuros;
    public int numeroParcelas;
  
    //var pra aux o numero de parcelas para verificar se existem parcelas disponiveis
    int auxNumParcelas = 0; 

    public double proximaParcela(){ 
        if ((this.numeroParcelas - this.auxNumParcelas) > 0){ //se existirem parcelas
            final double juros = valorTotal * taxaJuros; //calcula os juros de cada parcela
            double valor = (valorTotal / (double) numeroParcelas) + juros; //calcula o valor da parcela e soma os juros
            auxNumParcelas++; //var aux do numero de parcelas recebe mais 1
            return valor; //retorna o valor da parcela ja com os juros
        } else { //caso não tenha parcelas ainda
            return -1.0; //retorna -1 pois nao existem parcelas
        } //fim das comparações e do else
    } //fim do  proximaParcela

} //fim da classe 
