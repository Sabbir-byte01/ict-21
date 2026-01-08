package ict._21.ClassNames;

public class SumClass {

    public static SumClass instance = new SumClass();

    private SumClass() {}

    public double calculateSum() {
        double sum = 0.0;
        for (double i = 1.0; i >= 0.1; i -= 0.1) {
            sum += i;
        }
        return sum;
    }
}
