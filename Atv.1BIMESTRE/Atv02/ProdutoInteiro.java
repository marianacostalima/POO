package Atv_1BIMESTRE.Atv02; //declara o package

import java.util.Scanner; //importa o metodo Scanner

public class ProdutoInteiros{ //cria a clas principal "MediaAluno"

    public static void main(String [] args){ //cria o metodo principal 

        int a =0; //cria a var "a"

        Scanner ent = new Scanner(System.in); //declara o scanner como objeto

        System.out.print("Informe dois Inteiro: "); //Imprimi uma mensagem pedindo dois inteiros
        int b = ent.nextInt(); int c = ent.nextInt(); // recebe os dois valores na mesma linha

        a = calc(a, b, c); //chama o metodo para calcular e da o retorno como valor para a var "a"

        System.out.printf("%n %d * %d = %d %n", b, c, a); //Imprimi os valores
    }
    public static int calc(int a, int b, int c){ //cria um metodo secundario para calcular
        a = (b*c); //calculo 
        return a; //retorna a
    }
}
