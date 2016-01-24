package lesson6_9.adapter.adapter.v1.calc;

import lesson6_9.adapter.adapter.Arifmetika;

public class Calculator {

	Arifmetika arifmetika;

	public Calculator() {
		arifmetika = new Arifmetika();
	}

	public int summa(int a, int b) {
		int [] arr = {a, b};
		return arifmetika.summa(arr);
	}

	public int multiply(int a, int b) {

		return arifmetika.multiply(a, b);
	}
}
