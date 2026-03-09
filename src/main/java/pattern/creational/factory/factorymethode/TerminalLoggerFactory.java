package pattern.creational.factory.factorymethode;

public class TerminalLoggerFactory implements  ILoggerFactory{

    @Override
    public ILogger createLogger() {
        return new TerminalLogger();
    }

}
