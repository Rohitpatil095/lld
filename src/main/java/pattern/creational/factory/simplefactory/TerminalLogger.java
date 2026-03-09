package pattern.creational.factory.simplefactory;

public class TerminalLogger implements  ILogger{

    @Override
    public void log(){
        System.out.println("Terminal logger..");
    }
}
