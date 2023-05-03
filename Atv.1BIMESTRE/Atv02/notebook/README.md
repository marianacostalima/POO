# Atividade 2

Classe impressão de texto: "Main"  

IFPR - Campus Cascavel  
Aluno: MARIANA DA COSTA LIMA    
Disciplina: Programação Orientada a Objetos  
Professor: Nelson Bellincanta

Atividade:

- Crie uma classe em Java que realize cada uma das seguintes tarefas:

### Codigo:

a) Exibir a mensagem “Informe um inteiro: “, deixando o cursor na mesma linha;
```
System.out.print("Informe dois Inteiro: ");
```
b) Atribuir o produto de variáveis b e c para a variável a;
```
import java.util.Scanner;  //importa o metodo Scanner
Scanner ent = new Scanner(System.in);  //declara o scanner como objeto

System.out.print("Informe dois inteiros: "); //Imprimi uma mensagem pedindo dois inteiros
int b = ent.nextInt(); int c = ent.nextInt(); // recebe os dois valores na mesma linha

int a = (b*c); //cria var "a" e da o valor do produto de "b" e "c"

System.out.printf("%d * %d = %d", b, c, a); //Imprimi os valores
```
c) Utilizar um comentário para afirmar que um programa executa um cálculo de exemplo de folha de pagamento.
```
import java.util.Scanner; //importa o metodo Scanner
Scanner ent = new Scanner(System.in); //declara o scanner como objeto

System.out.print("Informe dois Inteiro: "); //Imprimi uma mensagem pedindo dois inteiros
int b = ent.nextInt(); int c = ent.nextInt(); // recebe os dois valores na mesma linha

int a = (b * c); //cria var "a" e dando o valor do produto de "b" e "c"

System.out.printf("%n %d * %d = %d %n", b, c, a); //Imprimi os valores
```
