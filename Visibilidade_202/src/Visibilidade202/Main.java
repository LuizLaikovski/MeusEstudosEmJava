package Visibilidade202;

public class Main {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "Compacto 07";
		c1.cor = "Azul";
	//  c1.ponta = 0.7f;
	//	c1.carga = 80;
	//	c1.tampadea = false;
		
		c1.status();
		c1.destampar();
		c1.rabiscar();
	}
}
