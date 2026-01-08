public class CustomPrintClass {

    public static CustomPrintClass instance = new CustomPrintClass();

    private CustomPrintClass() {}

    public void pr(String message) {
        System.out.println(message);
    }
}
