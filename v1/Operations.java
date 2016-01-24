package lesson6_9.adapter.adapter.v1;


import lesson6_9.adapter.adapter.v1.calc.Calculator;

public class Operations {
	
	Calculator calc;
	
	public int createSummaryReport(int factor) {
		int result = calc.summa(factor, 78);
		result = calc.summa(result, factor);
		return result;
	}
	
	public void setCalc(Calculator calc) {
		this.calc = calc;
	}
}
