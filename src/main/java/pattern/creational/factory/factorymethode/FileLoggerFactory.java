package pattern.creational.factory.factorymethode;

public class FileLoggerFactory implements  ILoggerFactory{

    @Override
    public ILogger createLogger() {
        return new FileLogger();
    }
}
