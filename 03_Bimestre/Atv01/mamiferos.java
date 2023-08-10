
public class Mamiferos{
    private String name; //atributo String nome
    private int age; //atributo int idade

    //met const da classe
    public Mamiferos(String namee, int agee){
        this.name = namee;
        this.age = agee;
    }

    public void setName(String namee){
        this.name = namee;
    }

    public void setAge(int agee){
        this.age = agee;
    }
   //met getNome para retorno da String nome
    public String getName(){
        return this.name;
    }
    //met getIdade para retorno da String idade
    public int getAge(){
        return this.age;
    }

    public void makeSound(){
        System.out.println("mammal sound");
    }

    public void move(){
        System.out.println("mammal moving");
    }

    
}
