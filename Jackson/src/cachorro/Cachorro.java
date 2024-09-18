package cachorro;
public class Cachorro {

    private String nome;
    private String raca;
    private int idade;

    
    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }
  
    public String nome() {
        return this.nome;
    }

    public String raca() {
        return this.raca;
    }

    public int idadeemanoshumanos() {
        return this.idade * 7;
    }

    public void latir() {
        System.out.println("au au");
    }
}


    
