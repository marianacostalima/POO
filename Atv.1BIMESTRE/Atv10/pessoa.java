public class Pessoa{
    //nome, idade e altura
  private String nome;
  private int idade;
  private double altura;
    
  public String getNome(){                   //metodo get para retorno String do nome 
    return nome;
  }
  public int getIdade() {                     //metodo get para retorno int da idade
    return idade;
  }
  public double getAltura() {                  //metodo get para retorno double da altura 
    return altura;
  }
  public void setNome(String nome) {            //metodo set para setar o nome do tipo String
    this.nome = nome;
  }
  public void setIdade(int idade) {             //metodo set para setar a idade do tipo int
    this.idade = idade;
  }
  public void setAltura(double altura) {         //metodo set para setar a altura do tipo double
    this.altura = altura;
  }
}
