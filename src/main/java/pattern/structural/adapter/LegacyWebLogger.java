package pattern.structural.adapter;

import java.util.Map;
import java.util.Objects;

public class LegacyWebLogger {

    public void printMe(Map<String, Object> prop){

        // accepts only map obj  -- old system
        System.out.println("Segment logging for web based logger.. " + prop );

    }


}
