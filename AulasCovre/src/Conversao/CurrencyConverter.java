package Conversao;
public class CurrencyConverter {
	public static double converter(double d, double r) {
		return d * r + (((d * r)/ 100) * 6);
	}
}
