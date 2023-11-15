public class RestockVisitor implements AccessoryVisitor{
    public String visit(Printer p) {
       return "Paper level low";
    }

    public String visit(Toaster t) {
        return "Toast level high";
    }
}
