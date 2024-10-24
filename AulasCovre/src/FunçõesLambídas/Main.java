package FunçõesLambídas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<String> listaList = new ArrayList<String>();
		
		listaList.add("Marcos");
		listaList.add("Maria");
		listaList.add("Júlia");
		listaList.add("Jack");
		listaList.add(2, "Luiz");
		
		System.out.println(listaList.size());
		for (String x : listaList) {
			System.out.println(x);
		}
		System.out.println("---------------");
		System.out.println("Indice da Maria: " + listaList.indexOf("Maria"));
		System.out.println("Indice do Marcos: " + listaList.indexOf("Marcos"));
		System.out.println("---------------");
		
		List<String> result = listaList.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("---------------");
		String name = listaList.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
		sc.close();
	}

}
