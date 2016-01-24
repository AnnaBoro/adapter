package lesson6_9.adapter.adapter.v2;

import lesson6_9.adapter.adapter.v2.calc.Calculator;

import java.util.Random;

public class Launcher {

	public static void main(String[] args) {

		Calculator ad = new AdapterBy();

//		Calculator calc = new DefaultCalculator();
		
		Operations o = new Operations();
		o.setCalc(ad);

		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			System.out.println(o.createSummaryReport(r.nextInt(100)));
		}
	}
}
