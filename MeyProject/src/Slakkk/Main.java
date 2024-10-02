package Slakkk;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Map<String, Object> variaveisDinamicas = new HashMap<>();
		
		String nomeDoObjeto;
		System.out.println("Digite o nome do professor que deseja cadastrar: "); nomeDoObjeto = sc.next();
		variaveisDinamicas.put(nomeDoObjeto, nomeDoObjeto);
		String nome = nomeDoObjeto;
		String variavelAuxiliar = (String) variaveisDinamicas.get(nomeDoObjeto);
		
		Professor variavel = new Professor(nome, "Projeto de Suicidio", 1, 3500, false);
		
		
		
		sc.close();
	}

}
