package _get_set_constr;

public class Main {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
//		c1.modelo = "Bic"; ESTÁ INCORRETO POIS O MÉTODO SET OFERECE MAIS SEGURANÇA
		c1.setModelo("Bic");
		c1.setPonta(0.8);
		
		Caneta c2 = new Caneta();
		c1.setModelo("Compacto");
		c2.setPonta(0.9);
		
		c1.status();
		c2.status();
	}

}