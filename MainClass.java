
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
