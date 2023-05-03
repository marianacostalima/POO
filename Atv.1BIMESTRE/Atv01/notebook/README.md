## ATIVIDADE 01

IFPR - Campus Cascavel
Aluno: Mariana da costa lima
Disciplina: Programação Orientada a Objetos
Professor: Nelson Bellincanta

ATIVIDADE:

- Crie uma classe em Java que seja capaz de apresentar a soma de todos os argumentos inteiros ou reais recebidos. Argumentos inválidos devem ser desconsiderados sem provocar a exibição de erros ou exceções.

Classe impressão de texto: "Main"

### codigo

``` 

import java.util.Scanner; //importa o metodo Scanner
Scanner ent = new Scanner(System.in); //cria um objeto Scanner

System.out.println("Digite um numero: "); //Pedindo para usuario digitar um numero
float num1 = ent.nextFloat(); //cria a var num1 que vai receber o que o usuario digitar

System.out.println("Digite outro numero: "); //Pedi para o usuario digitar outro numero
float num2 = ent.nextFloat(); //cria a var num2 que vai receber o que o usuario digitar

float soma = num1 + num2; //cria a vari soma e faz o calculo

System.out.printf("%n%.2f + %.2f = %.2f", num1, num2, soma); // Imprimidando o valor final


``
