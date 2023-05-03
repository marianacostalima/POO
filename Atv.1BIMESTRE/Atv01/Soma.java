/* Crie uma classe em Java que seja capaz de apresentar a soma de todos os argumentos inteiros ou reais recebidos. Argumentos inválidos devem ser desconsiderados sem provocar a exibição de erros ou exceções.
   IFPR-Campus Cascavel 3 ano de Informatica Aluna: Mariana da Costa Lima Professor: Nelson Bellincanta   */

package atividades_1bimestre.atividade_1;

import java.util.Scanner; //importando o metodo Scanner

public class Soma{ //cria a class principal
    public static void main(String [] args){ //cria o metodo principal
        
        Scanner ent = new Scanner(System.in); //cria um objeto Scanner

        System.out.println("Digite um numero: ");//pedi pro usuario inserir um numero
        float num1 = ent.nextInt(); //cria a var num1 e da o valor de entrada do usuario

        System.out.println("Digite outro numero: ");//pedi pro usuario inserir outro numero
        float num2 = ent.nextFloat(); //cria a var num2 e da o valor de entrada do usuario

        float soma=0; //cria a var soma, do tipo double e da o valor de 0

        soma = calc(num1, num2, soma); // chama o metodo calc e retorna o valor para a var soma

        System.out.printf("%n%.2f + %.2f = %.2f", num1, num2, soma); // Imprimi o valor final
    }
    public static float calc(float num1, float num2, float soma){ // cria um metodo que retorna valor double
        
        soma = num1 + num2; //calculo da soma
        return soma; //retorna soma
    }
}
