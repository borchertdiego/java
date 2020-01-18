package util;

public class CurrencyConverter {

	public static double dollarCalculator(double dollarPrice, double dollarQuantity) {
		
		double valueReal = dollarPrice * dollarQuantity;
		
		return valueReal + (valueReal * 0.06);
	}
}
