package Empresa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		System.out.print("Digite o número de funcionários que deseja registrar: "); int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Funcionário #"+ (i+1) +":");
			System.out.print("Id: "); int id = sc.nextInt();
			System.out.print("Nome:"); String nome = sc.next();
			System.out.print("Salário: R$ "); double salario = sc.nextDouble();
			
			funcionarios.add(new Funcionario(id, nome, salario));
		}
		
		System.out.println("Informe o ID do funcionário que deseja dar o aumento: "); int idAumento = sc.nextInt();
		
		System.out.println("Lista de funcionários: ");
		for (int i = 0; i < funcionarios.size(); i++) {
			System.out.println(funcionarios.toString());
		}
		
		sc.close();
	}

}
