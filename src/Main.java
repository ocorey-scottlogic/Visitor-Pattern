public class Main {
    public static void main(String[] args) {
        var printer = new Printer();
        var toaster = new Toaster();
        var restockVisitor = new RestockVisitor();
        var warningVisitor = new WarningVisitor();

        var paperLevel;
        var breadLevel;

        var printerTemp;
        var toasterTemp;

        System.out.println(paperLevel);
        System.out.println(breadLevel);
        System.out.println(printerTemp);
        System.out.println(toasterTemp);
    }
}