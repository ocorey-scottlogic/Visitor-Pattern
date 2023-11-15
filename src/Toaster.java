public class Toaster implements Accessory{
    public String accept(AccessoryVisitor v) {
        return v.visit(this);
    }

}
