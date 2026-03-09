package pattern.creational.factory.abstractfactory;

public class FileLoggerFactory implements LoggerFactory{
    @Override
    public FileLogger createFileLogger() {
        return null;
    }

    @Override
    public TerminalLogger createTerminalLogger() {
        return null;
    }
}
