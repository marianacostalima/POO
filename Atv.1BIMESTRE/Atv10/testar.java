public class Testar {//classe TestarPessoa

    public static void main(String[] args) {
        //cria o objeto pessoa1, pessoa2
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        //ultiliza o set na pessoa1
        pessoa1.setNome("Heitor"); //seta o nome
        pessoa1.setIdade(18); //seta a idade
        pessoa1.setAltura(1.70); //seta a altura

        //ultiliza o get na pessoa1
        System.out.println("metodos get do objeto pessoa1: \n"); //mensagem de orientação
        System.out.println(pessoa1.getNome()); //meotdo get nome para saida do nome
      
        //var idadePessoa1 recebe o retorno do getIdade da pessoa1
        int idadePessoa1 = pessoa1.getIdade(); 
        System.out.println(idadePessoa1); // saida da var idadePessoa1
        System.out.println(pessoa1.getAltura()); //metodo getAltura para retorno da altura da pessoa1

        pessoa2.setNome("Mari");
        pessoa2.setIdade(17);
        pessoa2.setAltura(1.50);
        
        System.out.println("\nmetodos get do objeto pessoa2: \n");
        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getIdade());
        System.out.println(pessoa2.getAltura());

    }//fim do  main
}//fim da classe 
