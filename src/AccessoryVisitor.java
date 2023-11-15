public interface AccessoryVisitor {
    String visit(Printer p);

    String visit(Toaster t);
}
