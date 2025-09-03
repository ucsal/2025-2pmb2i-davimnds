public class SafePrinterAdapter implements MultiFunctionDevice {
    private final MultiFunctionDevice simplePrinter;

    public SafePrinterAdapter(MultiFunctionDevice simplePrinter) {
        this.simplePrinter = simplePrinter;
    }

    @Override
    public void print(String content) {
        // Direciona a chamada para a impressora simples.
        this.simplePrinter.print(content);
    }

    @Override
    public void scan(String targetFile) {
        // Intercepta a chamada. Não faz nada para evitar a exceção!
        // Esta é a parte que resolve o seu problema.
        System.out.println("Ação de escanear foi ignorada em um dispositivo de impressão simples.");
    }
}