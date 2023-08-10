public class cachorro extends mammal{
    private String race; //atributo raca

    public cachorro(String racee, String nome, int age){
        super(name, age);
        this.race = racee;
    }

    public String getRace(){
        return this.race;
    }

    public void setRace(String racee){
        this.race = racee;
    }

    //met abanar o rabo
    public void wagYourTail(){
        System.out.println("O cachorro está abanando o rabo.");
    }
}
