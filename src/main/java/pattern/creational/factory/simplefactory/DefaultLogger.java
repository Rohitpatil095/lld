package pattern.creational.factory.simplefactory;

public class DefaultLogger implements  ILogger{

    @Override
    public void log(){
        System.out.println("Default logger..");
    }
}
