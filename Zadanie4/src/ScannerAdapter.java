public class ScannerAdapter implements Device {
    private Scanner scanner;

    public ScannerAdapter(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void start() {
        scanner.scanDocument();
    }

    @Override
    public void stop() {
        scanner.stopScanning();
    }
}