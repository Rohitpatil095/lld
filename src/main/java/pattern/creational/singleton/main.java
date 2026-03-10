package pattern.creational.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class main {

    public static void main(String[] args) {
        System.out.println("Creational demo");

        DbConnectionPool c1=DbConnectionPool.getInstance();
        DbConnectionPool c2=DbConnectionPool.getInstance();

        System.out.println(c1==c2);

        try(ExecutorService executor= Executors.newFixedThreadPool(10);){
            for(int i=0;i<10;i++){
                System.out.println(executor.submit(DbConnectionPool::getInstance).get());
            }
        }catch (Exception e){

        }
    }
}
