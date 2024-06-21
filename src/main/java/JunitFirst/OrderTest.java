package JunitFirst;

//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
//import org.junit.jupiter.api.TestInstance;

@TestMethodOrder(MethodOrderer.MethodName.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class OrderTest {
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
	 @DisplayName("1")
	 void testExample3() {
	       System.out.println("three");
	    }
}
