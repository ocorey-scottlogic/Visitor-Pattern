public class Main {
    public static void main(String[] args) {
        var printer = new Printer();
        var toaster = new Toaster();
        var restockVisitor = new RestockVisitor();
        var warningVisitor = new WarningVisitor();

        var paperLevel = printer.accept(restockVisitor);
        var breadLevel = toaster.accept(restockVisitor);

        var printerTemp = printer.accept(warningVisitor);
        var toasterTemp = toaster.accept(warningVisitor);

        System.out.println(paperLevel);
        System.out.println(breadLevel);
        System.out.println(printerTemp);
        System.out.println(toasterTemp);
    }
}