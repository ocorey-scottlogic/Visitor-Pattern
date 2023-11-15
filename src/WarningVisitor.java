public class WarningVisitor implements AccessoryVisitor{
    public String visit(Printer p) {
        return "Printer temp low";
    }

    public String visit(Toaster t) {
        return "Toaster temperature high";
    }
}
