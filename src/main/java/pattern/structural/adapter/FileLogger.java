package pattern.structural.adapter;

import java.util.Map;
import java.util.Objects;

public class FileLogger implements  ILogger{

    LegacyWebLogger legacyWebLogger;

    FileLogger(LegacyWebLogger legacyWebLogger){
        this.legacyWebLogger=legacyWebLogger;
    }

    @Override
    public void log(String message) {

        // receiving as string in new system ---> incorporating with old which accepts only Map so we convert/adapt and send to old system for print
        Map<String, Object> properties=Map.of("message", message);
        legacyWebLogger.printMe(properties);
    }
}
