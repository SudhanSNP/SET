package DesignPattern.SingletonPattern;

public class PrintMessage implements IPrintMessage{
    private static PrintMessage printMessage;

    private PrintMessage() {
        System.out.println("Printing Message");
    }

    public static PrintMessage GetPrintMessage() {
        if(printMessage == null) {
            synchronized (PrintMessage.class) {
                if(printMessage == null) {
                    printMessage = new PrintMessage();
                }
            }
        }
        return printMessage;
    }

    @Override
    public void Print(String message) {
        System.out.println(message);
    }
}
