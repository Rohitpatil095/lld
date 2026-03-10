package pattern.creational.singleton;

public class DbConnectionPool {

    private static DbConnectionPool dbConnectionPool;

    private DbConnectionPool() {
    }

    public static DbConnectionPool getInstance() {
        if (dbConnectionPool == null) {
            synchronized (DbConnectionPool.class) {
                if (dbConnectionPool == null) {
                    dbConnectionPool = new DbConnectionPool();
                }
            }
        }
        return dbConnectionPool;
    }
}

