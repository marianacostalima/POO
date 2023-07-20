
public class ExersemRetorno{    // Declara a classe 
  
    // Declara o main que inicia o programa
    public static void main(String[] args) {
      
        //declaração, alocação e inicializacao do vetor "vetor" 
        int[] vetor = {123, 32, 1, 5, 7, 4, 86, 1, 3, 10};

        //o imprimirNumeros printar o array 
        imprimirNumeros(vetor);

        //declaração, alocação e inicializacao do vetor "vetor2" 
        int[] vetor2 = {32, 23, 12, 54, 2, 3, 1, 2, 3, 0};

        // o somaNumeros soma os dois vetores 
        somaNumeros(vetor, vetor2);
        
    } // fim do main
    
    // Declara o imprimirNumeros que recebe um array de inteiros e imprime os números
    public static void imprimirNumeros(int[] array) {
        System.out.println("Saida do Vetor: ");
        //estrutura de repetição que percorre o vetor e faz um print de cada posição
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        //quebra de linha
        System.out.println();
    } // fim do imprimirNumeros

    //declara o imprimirNumeros que faz a soma de dois array como parametro 
    public static void somaNumeros (int[] array, int[] array2) {
        //declara e aloca do vetor "arraysoma" com o tamanho do vetor "vetor"
        int[] arraySoma = new int[array.length];

        //estrutura de repetição que realiza a soma dos array e atribui o valor para outro arrray
        for (int i = 0; i < array.length; i++) {
            arraySoma[i] = array[i] + array2[i];
        }

        //orientação
        System.out.println();
        System.out.println("Saida do vetor somado");
        //o imprimirNumeros printa a soma dos array
        imprimirNumeros(arraySoma);
    } // fim do somaNumeros

}// fim da classe
