package JunitFirst;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.time.DayOfWeek;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.*;

public class DisableEnable {

    @Test
    @Disabled("Disabled example")
    void example1() {
        System.out.println("example1");
    }
    @DisabledOnOs(value=OS.WINDOWS
//    		,disableReason="Demo"+"@DisabledOnOs"
    )
    @Test
    void example2() {
        System.out.println("example2");
    }

    @Test
    
    void example3() {
        System.out.println("example3");
    }
    @DisabledIf(value="providee")
    @Test
    void example4() {
        System.out.println("example4");
    }

    @Test
    void example5() {
        System.out.println("example5");
    }
    
    boolean isWednesday() {
        return LocalDateTime.now().getDayOfWeek() == DayOfWeek.WEDNESDAY;
    }

}
