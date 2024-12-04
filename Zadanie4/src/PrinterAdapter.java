public class PrinterAdapter implements Device {
    private Printer printer;

    public PrinterAdapter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void start() {
        printer.printDocument();
    }

    @Override
    public void stop() {
        printer.stopPrinting();
    }
}