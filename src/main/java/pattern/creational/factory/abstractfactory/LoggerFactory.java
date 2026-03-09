package pattern.creational.factory.abstractfactory;

public interface LoggerFactory {
    FileLogger createFileLogger();
    TerminalLogger createTerminalLogger();
}
