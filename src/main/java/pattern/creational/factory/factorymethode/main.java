package pattern.creational.factory.factorymethode;

public class main {

    public static void main(String[] args) {
        System.out.println("logger demo");

        ILoggerFactory loggerFactory =new TerminalLoggerFactory();
        ILogger logger= loggerFactory.createLogger();
        logger.log();

        loggerFactory=new FileLoggerFactory();
        ILogger log=loggerFactory.createLogger();
        log.log();
    }
}
