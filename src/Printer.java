public class Printer {
    public String accept(AccessoryVisitor v) {
       return v.visit(this);
    }
}
