package com.example.elefant1;

public class Basket {

	int items=2;
	double basePrice=35.2;
	String country="AT";

	@Override
	public String toString() {
		return "Basket{" + "items=" + items + ", basePrice=" + basePrice + ", country='" + country + '\'' + '}';
	}

	public static void main(String[] args) {
		System.out.println(new Basket());
	}
}
