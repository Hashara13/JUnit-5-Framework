package JunitFirst;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class OrderTest2 {
	@BeforeAll
	 void beforeAll() {
		System.out.println("Done things beforeAll");
	}
	@BeforeEach
	 void beforeeach() {
		System.out.println("Done things before each");
	}
	@AfterAll
	public void afterAll() {
		System.out.println("Done things afterAll ");
	}
	@AfterEach
	public void afterEach() {
		System.out.println("Done things afterEach ");
	}
	 @Test
	 @Order(2)
//	 @DisplayName("1")
	 void testExample1() {
	       System.out.println("one");
	    }
	 @Test
	 @DisplayName("2")
	 void testExample2() {
	       System.out.println("two");
	    }
	 @Test
	 @Order(1) // assign order
	 @DisplayName("1")
	 void testExample3() {
	       System.out.println("three");
	    }
}
