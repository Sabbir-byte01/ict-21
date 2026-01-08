
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
