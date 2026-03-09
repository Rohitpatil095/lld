package pattern.creational.factory.abstractfactory;

public class ConcurrentFileLogger implements FileLogger{
    @Override
    public void log() {
        System.out.println("Concurrent file logger");
    }
}
