package JunitFirst;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.MethodSource;
//import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.CsvSource;
import my.test.data.CsvFileSource;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Second {
//@ParameterizedTest
//@ValueSource(ints= {1,4,5})
//void intVal(int thepar) {
//	
//	System.out.println("Values are : "+thepar);
//
//}
//
//@ParameterizedTest
////@EmptySource //1st parm null
////@NullEmptySource empty & null
//@ValueSource(strings= {"1st","2nd"})
//void intVal2(String thepar) {
//	
//	System.out.println("Values are : "+thepar);
//
//}
//
//@ParameterizedTest
//@CsvSource(value = {"one,two", "three,four", "five,six"}) // Use CsvSource for comma-separated values
//void csvSource_StringString(String thePar1, String thePar2) { // Corrected variable names
//    System.out.println("Values 1: " + thePar1 + ", Values 2: " + thePar2); // Improved output message
//}
//
//@ParameterizedTest
//@CsvSource(value = {"one,35,false", "three,4,true", "five,9,true"}) // Use CsvSource for comma-separated values
//void csvSource_SIB(String thePar3, int thePar4, boolean thePar6) { // Corrected variable names
//    System.out.println("Values 1: " + thePar3 + ", Values 2: " + thePar4+", Values 3: "+thePar6); // Improved output message
//}
//
//// if have comma
//@ParameterizedTest
//@CsvSource(value = {"one,two,three", "three,four", "five,six"}) // Use CsvSource for comma-separated values
//void csvSource_Stringwithcoma(String thePar1, String thePar2) { // Corrected variable names
//    System.out.println("Values 1: " + thePar1 + ", Values 2: " + thePar2); // Improved output message
//}
//
//@ParameterizedTest
//@CsvSource(value = {"one?three", "three?four"},delimiter='?') // Use ? as separate values
//void csvSource_Stringwithcoma2(String thePar1, String thePar2) { // Corrected variable names
//    System.out.println("Values 1: " + thePar1 + ", Values 2: " + thePar2); // Improved output message
//}

//@ParameterizedTest
////@CsvFileSource(files="/Junit_Learn/src/test/resources/params/list.csv")
//void csvSource_csv(String thePar1, String thePar2,int thePar3) {
//    System.out.println("Values 1: " + thePar1 + ", Values 2: " + thePar3); 
//}
	
@ParameterizedTest
//@MethodSource(value="hahsara")
@MethodSource(value="JunitFirst.Third#hahsara") // import from another class & test
void methodSource(String thePar1) {
    System.out.println("Values 1: " + thePar1); 
}
	
	
	
}
