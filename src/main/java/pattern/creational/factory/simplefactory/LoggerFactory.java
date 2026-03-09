package pattern.creational.factory.simplefactory;

import java.io.File;
import java.util.Scanner;
import java.util.logging.Logger;

public class LoggerFactory {
    public static void main(String[] args) {

        Scanner ne=new Scanner(System.in);
        System.out.println("put scanner type \n");
        LoggerType type=LoggerType.valueOf(ne.nextLine().trim());

        ILogger logger;

        if(type==LoggerType.File){
            System.out.println("Enter file");
            logger=new FileLogger();
        }
        else if(type==LoggerType.Terminal){
            System.out.println("Enter terminal");
            logger=new TerminalLogger();
        }else{
            System.out.println("Enter default");
            logger=new DefaultLogger();
        }

        System.out.println("Logger type " + logger.getClass() );
    }
}
