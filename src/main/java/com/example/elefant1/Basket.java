package com.example.elefant1;

public class Basket {

	int items=2;
	double basePrice=35.2;
	String country="AT";




	private static class CalculationResult{
		double netPrice;

		@Override
		public String toString() {
			return "CalculationResult{" + "netPrice=" + netPrice + '}';
		}
	}

	public CalculationResult calculate(){
		CalculationResult res = new CalculationResult();
		res.netPrice=items*basePrice;
		return res;
	}

	@Override
	public String toString() {
		return "Basket{" + "items=" + items + ", basePrice=" + basePrice + ", country='" + country + '}' +'\n' + calculate();
	}

	public static void main(String[] args) {
		System.out.println(new Basket());
	}
}
