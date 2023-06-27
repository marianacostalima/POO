# Atv09

Você foi contratado para desenvolver um programa em Java que realiza operações com números inteiros. Para isso, você precisa implementar métodos sem retorno que executam tarefas específicas. 
- Implemente o método imprimirNumeros, que recebe um array com 10 inteiros como parâmetro e exibe os números na tela, separados por um espaço. O método não deve retornar nenhum valor.
- Implemente o método somaNumeros, que recebe um array com 10 inteiros como parâmetro, calcula a soma de todos os números do array e exibe o resultado na tela. O método não deve retornar nenhum valor 
- No método main, um array de números inteiros é criado e inicializado. Você deve chamar o método imprimirNumeros passando o array como argumento. Em seguida, chame o método somaNumeros para calcular a soma dos números e exibir o resultado. Por fim, chame novamente o método imprimirNumeros para exibir o array atualizado após a soma.
Observações:
Os métodos imprimirNumeros e somaNumeros devem ser implementados dentro da classe ExercicioSemRetorno.
Utilize estruturas de repetição e operações matemáticas para calcular a soma dos números.


IFPR - Campus Cascavel
Aluno: Mariana da Costa Lima
Turma: 3° INF 2023
Disciplina: Programação orientada a Objetos 
Professor: Nelson Bellincanta

```
public class ExSemRetorno{                                                  // Declaração da classe e início da classe Main 
    
    public static void main(String[] args) {            // Declara o main e inicia a execução do programa 

        int[] vetor = {123, 32, 1, 5, 7, 4, 86, 1, 3, 10};              //declaração, alocação e inicializacao do vetor  

        imprimirNum(vetor);                     //chamando o metodo imprimirNum para printar o array 

        int[] vetor2 = {32, 23, 12, 54, 2, 3, 1, 2, 3, 0};   //declaração, alocação e inicializacao do vetor "vetor2" 

        somaNum(vetor, vetor2);            //chamando o metodo somaNum para somar os dois vetores 

        
    } 
    // fim do main
    
    public static void imprimirNum(int[] array) {        //recebe um array de inteiros e imprime os números
        System.out.println("Saida Vetor: ");
        for (int i = 0; i < array.length; i++) {             //repetição que percorre o vetor e faz um print de cada posição
            System.out.print(array[i] + "\t");
        }
        
        System.out.println();   //quebra a linha
    } 
    // fim do imprimirNum

    public static void somaNum (int[] array, int[] array2) {             //soma de dois array como parametro 
        int[] arraySoma = new int[array.length];                       //alocação do vetor arraysoma com o tamanho do vetor

        for (int i = 0; i < array.length; i++) {              //realiza a soma dos array e atribui o valor para outro arrray
            arraySoma[i] = array[i] + array2[i];
        }

        //orientação

        System.out.println();
        System.out.println("Saida do vetor somado");
        imprimirNum(arraySoma);
    } 
    // fim do somaNum

}
// fim da classe 

```

