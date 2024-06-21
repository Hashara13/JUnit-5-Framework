package JunitFirst;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.*;

public class Assumptions {
	@ParameterizedTest(name="Run:{index}-value:{arguments}")
	@ValueSource(ints= {1,4,5})
	void intVal(int thepar) {
	assumeTrue(thepar>3); // set condition for run,, on here value > 3only run
		System.out.println("Values are : "+thepar);
	
	}
	
	@ParameterizedTest
	@CsvSource(value = {"one,two", "three,four"}) 
	void csvSource_StringString(String thePar1, String thePar2) { 
		assumeFalse(thePar1.equals("one"),"Failed to run here"); //  fail run
		System.out.println("Values 1: " + thePar1 + ", Values 2: " + thePar2); // Improved output message
	}
	
	@ParameterizedTest
	@CsvSource(value = {"one,35,false", "three,4,true", "five,9,true"}) // Use CsvSource for comma-separated values
	void csvSource_SIB(String thePar3, int thePar4, boolean thePar6) { // Corrected variable names
	    assumingThat(thePar4>20,()->System.out.println("runnnnn" ));
		System.out.println("Values 1: " + thePar3 + ", Values 2: " + thePar4+", Values 3: "+thePar6); // Improved output message
	}
}
