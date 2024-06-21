package JunitFirst;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;

public class MyTest {

    @Test
    void testExample1() {
        // Check two strings are same
        Assertions.assertEquals("First", "First", "Not assertions Equal");
        System.out.println("passed");
    }

    @Test
    void testExample2() {
        // Check two list items are same
        List<String> obj = Arrays.asList("First", "second", "Third");
        List<String> obj2 = Arrays.asList("First", "second", "Third");
        Assertions.assertEquals(obj, obj2);
        System.out.println("Passed");
    }

    @Test
    void testExample3() {
        // Check two arrays items are the same
        int[] obj = {2, 5, 6};
        int[] obj2 = {2, 5, 6};
        Assertions.assertArrayEquals(obj, obj2);
        System.out.println("Passed");
    }

    @Test
    void testExample4() {
        // Check boolean value are the same
        Assertions.assertTrue(true, "Is true");
        System.out.println("Passed");
    }

    @Test
    void testExample5() {
        // Check exception is thrown
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("Exception message");
        });
        System.out.println("Passed");
    }

    @Test
    void testExample6() {
        // do multiple assertions
        Assertions.assertAll(
            () -> Assertions.assertEquals("First", "First", "Not assertions Equal"),
            () -> {
                List<String> obj = Arrays.asList("First", "second", "Third");
                List<String> obj2 = Arrays.asList("First", "second", "Third");
                Assertions.assertEquals(obj, obj2);
            }
        );
        System.out.println("Passed");
    }
}
