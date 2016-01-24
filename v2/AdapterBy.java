package lesson6_9.adapter.adapter.v2;


import lesson6_9.adapter.adapter.Arifmetika;
import lesson6_9.adapter.adapter.v2.calc.Calculator;

public class AdapterBy implements Calculator{


    @Override
    public int summa(int a, int b) {
        int[] nums = {a, b};
        return Arifmetika.summa(nums);
    }

    @Override
    public int multiply(int a, int b) {

        return Arifmetika.multiply(a, b);
    }
}
