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
public class NumberConversionClass {

    public static NumberConversionClass instance = new NumberConversionClass();

    private NumberConversionClass() {}

    public String decimalToBinary(int n) {
        return Integer.toBinaryString(n);
    }

    public String decimalToHex(int n) {
        return Integer.toHexString(n);
    }

    public String decimalToOctal(int n) {
        return Integer.toOctalString(n);
    }

    public int binaryToDecimal(String b) {
        return Integer.parseInt(b, 2);
    }

    public int hexToDecimal(String h) {
        return Integer.parseInt(h, 16);
    }

    public int octalToDecimal(String o) {
        return Integer.parseInt(o, 8);
    }
}
public class DivisorMultipleClass {

    public static DivisorMultipleClass instance = new DivisorMultipleClass();

    private DivisorMultipleClass() {}

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
public class CustomPrintClass {

    public static CustomPrintClass instance = new CustomPrintClass();

    private CustomPrintClass() {}

    public void pr(String message) {
        System.out.println(message);
    }
}
import java.util.Scanner;

public class SimpleCalculator {

    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        System.out.println("\nAddition: " + add(x, y));
        System.out.println("Subtraction: " + subtract(x, y));
        System.out.println("Multiplication: " + multiply(x, y));
        System.out.println("Division: " + divide(x, y));

        sc.close();
    }
}
public class MainClass {
public static void main(String[] args) {
// Sum
double result = SumClass.instance.calculateSum();
CustomPrintClass.instance.pr("Sum = " + result);
// GCD & LCM
int a = 12, b = 18;
CustomPrintClass.instance.pr("GCD = " + DivisorMultipleClass.instance.gcd(a, b));
CustomPrintClass.instance.pr("LCM = " + DivisorMultipleClass.instance.lcm(a, b));
// Number Conversion
NumberConversionClass.instance.convert(25);
// Custom Print
CustomPrintClass.instance.pr("All classes executed successfully!");
}
}
