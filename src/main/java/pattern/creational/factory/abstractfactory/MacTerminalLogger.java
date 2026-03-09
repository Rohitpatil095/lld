package pattern.creational.factory.abstractfactory;

public class MacTerminalLogger implements TerminalLogger{

    @Override
    public void log() {
        System.out.println("Mac terminal Logger..");
    }
}
