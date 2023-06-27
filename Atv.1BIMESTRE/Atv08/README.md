# Atv08

IFPR - Campus Cascavel

Disciplina: Programação orientada a Objetos Professor: Nelson Bellincanta

Turma: 3° INF 2023

Aluno: Mariana da Costa Lima

Uma pequena companhia aérea acabou de comprar um computador para seu novo sistema automatizado de reservas. Você foi solicitado a desenvolver o novo sistema. Você escreverá um aplicativo para atribuir assentos em cada voo da companhia aérea (capacidade: 10 assentos).
O sistema deve exibir as seguintes alternativas: 

- Por favor digite 1 para Primeira Classe e digite 2 para Classe Econômica .  Se o usuário digitar 1, o sistema deve atribuir assentos na primeira classe (poltronas 1 a 5). Se o usuário digitar 2, o sistema deve atribuir um assento na classe econômica (poltronas 6 a 10). 

- O sistema deve ainda exibir um cartão de embarque indicando o número da poltrona da pessoa e se ela está na primeira classe ou na classe econômica.

- Utilize um array unidimensional do tipo primitivo boolean para representar o gráfico de assentos do avião. 

- Inicialize todos os elementos do array como false para indicar que todas as poltronas estão desocupadas. 

- À medida que cada assento é atribuído, configure o elemento correspondente do array como true para indicar que o assento não está mais disponível.

- O sistema nunca deve atribuir uma poltrona que já foi reservada. 

- Quando a classe econômica estiver lotada, o sistema deve perguntar à pessoa se ela aceita ficar na primeira classe (e vice-versa). Se sim, faça a atribuição apropriada de assento. Se não, exiba a mensagem "O próximo voo parte em 3 horas".


```
import java.util.Scanner;   //importa a classe Scanner do pacote java.util

public class Atv08
{

    final static Scanner leitor = new Scanner(System.in); //prepara a entrada de dados
    final static String nomesClientes[] = new String[10]; //declaração e alocação do vetor assentos 
    final static boolean assentos[] = new boolean[10]; 
    
    // 0 a 5 primeira classe e de 6 a 10 classe economica    
    // todos os assentos como false pois estão "vazios"
    
    public static void CompraAssento(){
		System.out.println("Por favor digite 1 para Primeira Classe e digite 2 para Classe Econômica");  //mensagem de orientação

        int entrada = leitor.nextInt();         //entrada para a classe de compra

        if (entrada == 1){ //se entrada == primeira classe
            int i = 0; // variavel para percorrer o vetor dos assentos
            boolean achouAssento = true; //variavel auxiliar para percorrer assentos e achar um assento false

            do{ //para percorrer pelo menos uma vez
                if (i == 5){ //apenas 5 assentos da primeira classe

                    System.out.println("===========================================\n");
                    System.out.println("Todos os assentos da primeira classe estão cheios");
                    System.out.println("===========================================\n");

                    for(int hj = 5; hj<11; hj++){ //percorrendo o vetor na classe economica
                        if (assentos[hj] == false){
			
                            System.out.println("Possuem assentos disponiveis na classe economica");
                            System.out.println("deseja comprar assentos ? (1 (sim) 2 (não)0)");

                            int a = leitor.nextInt(); //entrada para a resposta 

                            if (a == 1){
                                CompraAssento(); //chama a função para a compra novamente
                            } else{
                       
                                System.out.println("===========================================\n");
                                System.out.println("Pena que não sera possivel realizar a compra :(");
                                System.out.println("===========================================\n");
                            }

                            break; //fim do for
                        }
                    }
                    break;
                }

                if (assentos[i] == false){ //se achou um assento vazio (false)
                    System.out.println("digite seu nome para a compra"); 
                    String nomeCliente = leitor.next(); //entrada do nome do cliente em String
                    nomesClientes[i] = nomeCliente; //adicionando no vetor o nome do cliente
                    assentos[i] = true; //colocando que o assento foi vendido
                    achouAssento = false; //achou um assento para de percorrer 
                } else{
                    i += 1; //vai para a proxima posição (proximo assento)
                }

            }while(achouAssento); //repete se nao achou um assento
        }
	
        if (entrada == 2){ //se entrada == classe economica
            int i = 5; //variavel que começa em 5 (assentos de 5 a 10)
            boolean achouAssento = true; //axiliando para achar um assentos

            do{ //repete pelo menos uma vez
                if (i == 10){ //apenas 5 assentos da classe economica
                    System.out.println("===========================================\n");
                    System.out.println("Todos os assentos da economica estão cheios");
                    System.out.println("===========================================\n");

                    for(int hj = 0; hj<6; hj++){ //for de 0 até 5 (primeira classe)
                        if (assentos[hj] == false){
                            System.out.println("Possuem assentos disponiveis na primeira classe");
                            System.out.println("deseja comprar assentos ? (1 (sim) 2 (não))");

                            int a = leitor.nextInt();

                            if (a == 1){
                                CompraAssento();
                            } else{
                                System.out.println("===========================================\n");
                                System.out.println("Pena que não sera possivel realizar a compra :(");
                                System.out.println("===========================================\n");
                            }
                            break;
                        }
                    }

                    System.out.println("===========================================\n");
                    System.out.println("infelizmente não há assentos disponiveis");
                    System.out.println("===========================================\n");

                    break;
                }

                if (assentos[i] == false){
                    System.out.println("digite seu nome para a compra");
                    String nomeCliente = leitor.next();
                    nomesClientes[i] = nomeCliente;
                    assentos[i] = true;
                    achouAssento = false;
                } else{
                    i += 1;
                }

            }while(achouAssento);
        }
    }
    
	public static void main(String[] args) { //primeira classe a ser executada no código

        System.out.println("\n");
        System.out.println("bem vindo a novo sistema automatizado de reservas. \n");
        
        for (int i = 0; i<10; i++){ //repete 10x (10 assentos)

            System.out.println("\n A seguir os assentos disponiveis ou não");
            System.out.println("primeira classe a seguir: ");
            for(int a = 0; a<10; a++){ //repete 10x (10 assentos)
	    
                System.out.println(assentos[a]+ "\t"+ nomesClientes[a]);                  //verificando os assentos disponiveis
                if (a == 4){
                System.out.println("classe economica a seguir: ");
                }
        }
            CompraAssento();
        }

        System.out.println("Todas os assentos lotados");
        System.out.println("Programa finalizado :)");
        System.out.println("©Copyright 2023 by Gabriel. All rights reversed.");

	}
}


```
