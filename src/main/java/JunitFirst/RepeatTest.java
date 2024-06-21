package JunitFirst;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.RepetitionInfo;

public class RepeatTest {

    @RepeatedTest(5)
    void example1() {
        System.out.println("example1");
    }

    @RepeatedTest(value = 3, name = "Running: {currentRepetition}")
    @DisplayName("Repeated")
    void example2() {
        System.out.println("example2");
    }

    @RepeatedTest(3)
    void thirdRepeatedMethod(RepetitionInfo repetitionInfo) {
        System.out.println("This code will run at each repetition");

        Assumptions.assumingThat(repetitionInfo.getCurrentRepetition() == 3,
                () -> System.out.println("This code only runs for repetition " + "3"));
    }
}
