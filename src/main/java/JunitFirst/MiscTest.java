package JunitFirst;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.Timeout;

public class MiscTest {

	 @Test
	 @Timeout(2)  //test sleep after 2S
	    void testExample1() throws InterruptedException {
		 
		System.out.println("Timeout chck");
	 Thread.sleep(6000);
	 }
	 
	 @TestInstance(TestInstance.Lifecycle.PER_CLASS)
	 @Nested
	 class NetsetClass{ // inner nested class example
		 @Test
		 void testExample1() {
		       System.out.println("one");
		    }
	 }
	 
	@HasharaAnn
	 void testExample13() throws InterruptedException{ // mycustom annotation
		 
			System.out.println("My custom annotation");
			Thread.sleep(6000);
	}	
}
