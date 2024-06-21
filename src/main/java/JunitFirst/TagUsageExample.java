package JunitFirst;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TagUsageExample {

    @Test
    @Tag("Tag1")
    @Tag("Tag2")
    void exampleTest() {
        System.out.println("This is an example test.");
    }
}
