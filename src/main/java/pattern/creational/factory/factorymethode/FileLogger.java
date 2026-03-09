package pattern.creational.factory.factorymethode;

public class FileLogger implements  ILogger{

    @Override
    public  void log(){
        System.out.println("File logger..");
    }

}
