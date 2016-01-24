package lesson6_9.adapter.adapter.v2;


import lesson6_9.adapter.adapter.Arifmetika;
import lesson6_9.adapter.adapter.v2.calc.Calculator;

public class AdapterByObject implements Calculator{

    Arifmetika arif = new Arifmetika();

    @Override
    public int summa(int a, int b) {
        int[] nums = {a, b};
        return arif.summa(nums);
    }

    @Override
    public int multiply(int a, int b) {

        return arif.multiply(a, b);
    }
}
