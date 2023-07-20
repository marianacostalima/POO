public class Ultilizar { 
  //metodo main que inicia o programa
    public static void main(String[] args) { 
        //instanciando o E1, E2 com a classe Emprestimo
        Emprestimo E1 = new Emprestimo();
        Emprestimo E2 = new Emprestimo();

        //atribuindo valores as var (E1, E2)
        E1.numeroParcelas = 12; //atribuindo numeroParcelas
        E1.taxaJuros = 0.1; //10% atribundo os juros
        E1.valorTotal = 1000.0; //o valor total 

        E2.numeroParcelas = 360; //atribuindo numeroParcelas
        E2.taxaJuros = 0.03; // 3 % atribundo os juros
        E2.valorTotal = 500000.0; //500 mil  o valor total 

        double proxE1, proxE2; //var que recebe o valor do proximaParcela 
        System.out.println("Valores das parcelas: "); //orientação

        //do,  porque é necessario receber a parcela ao menos uma vez
        do {
            //pega os valores de cada parcela e atribui as var
            proxE2 = E2.proximaParcela(); //retorna o valor da proxima parcela de E2
            proxE1 = E1.proximaParcela(); //retorna o valor da proxima parcela de E1

            System.out.println("E1: " + proxE1 + "\t E2: " + proxE2); //saida com os valores das parcelas

        }while(proxE1 > 0 && proxE2 > 0); //caso ainda existam parcelas volta ao laço de repetição

    }//fim do  main
}// fim da classe 
