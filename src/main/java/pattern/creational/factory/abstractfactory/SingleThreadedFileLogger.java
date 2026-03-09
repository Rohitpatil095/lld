package pattern.creational.factory.abstractfactory;

public class SingleThreadedFileLogger implements FileLogger{

    @Override
    public void log() {
        System.out.println("Single threaded file logger..");
    }
}
