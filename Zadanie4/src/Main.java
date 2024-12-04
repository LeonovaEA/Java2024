public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Scanner scanner = new Scanner();

        Device printerDevice = new PrinterAdapter(printer);
        Device scannerDevice = new ScannerAdapter(scanner);

        printerDevice.start();
        printerDevice.stop();

        scannerDevice.start();
        scannerDevice.stop();
    }
}
