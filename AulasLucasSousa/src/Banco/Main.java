package Banco;

public class Main {

	public static void main(String[] args) {
		ContaBanco luiz = new ContaBanco("123456", "Corrente", "Luiz Henrique Pasin Laikovski", 234567.90, true);
		
		luiz.status();
	}

}
