package pattern.creational.factory.factorymethode;

public class TerminalLogger implements  ILogger{

    @Override
    public void log(){
        System.out.println("Terminal Logger..");
    }

}
