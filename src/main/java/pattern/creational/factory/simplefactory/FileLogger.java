package pattern.creational.factory.simplefactory;

public class FileLogger implements  ILogger{
    @Override
    public void log(){
        System.out.println("File logger");
    }
}
