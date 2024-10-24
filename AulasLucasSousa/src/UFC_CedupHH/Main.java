package UFC_CedupHH;
import java.util.Locale;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Lutador l[] = new Lutador[6];
		l[0] = new Lutador("José ALdo", "Brasileiro", 38, 1.70, 63, 38, 3, 8);
		l[1] = new Lutador("Islam Makhachev", "Russa", 32, 1.78, 70, 26, 2, 1);
		l[2] = new Lutador("Alex Pereira", "Brasileiro", 37, 1.93, 83.7, 12, 2, 2);
		l[3] = new Lutador("Dricus du Plessis", "Africano", 30, 1.83, 83.9, 14, 4, 52);
		l[4] = new Lutador("Jonh Jones", "Estadunidense", 37, 1.93, 83.9, 27, 1, 1);
		l[5] = new Lutador("Tom Aspinall", "Britanico", 31, 1.96, 114, 12, 3, 3);
		
		
		l[0].status();
		l[1].status();
		Luta UFCC = new Luta();
		UFCC.marcarLuta(l[0], l[4]);
		UFCC.lutar();
		l[0].status();
		l[1].status();

		sc.close();
	}
}