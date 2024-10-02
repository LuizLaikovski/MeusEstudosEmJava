package popo;

import java.util.HashMap;
import java.util.Map;


public class Teste {

	public static void main(String[] args) {
		// Criação de um mapa que associa nomes (strings) a objetos
        Map<String, Object> variaveisDinamicas = new HashMap<>();
        
        // Criar uma "variável" com o nome vindo de uma string
        String nomeVariavel = "minhaVariavel";
        variaveisDinamicas.put(nomeVariavel, 123);
        
        // Acessar o valor dessa "variável"
        System.out.println("Valor de " + nomeVariavel + ": " + variaveisDinamicas.get(nomeVariavel));
        
        // Criar outra "variável" dinamicamente
        String outraVariavel = "outraVariavel";
        variaveisDinamicas.put(outraVariavel, "Olá Mundo");
        
        // Acessar o valor da outra "variável"
        System.out.println("Valor de " + outraVariavel + ": " + variaveisDinamicas.get(outraVariavel));
    }
}