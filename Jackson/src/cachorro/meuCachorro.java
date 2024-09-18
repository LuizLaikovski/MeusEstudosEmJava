package cachorro;
public class meuCachorro {
    public static void main(String[] args){
    	
        Cachorro meuCachorro = new Cachorro("fofuxo", "salsicha", 4);
        
        System.out.println("nome: " + meuCachorro.nome());
        System.out.println("raça: " + meuCachorro.raca());
        System.out.println("idade em anos humanos: " + meuCachorro.idadeemanoshumanos());
        
        meuCachorro.latir();
    }    
}        
