package numberRangeSummarizer.Test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

import numberrangesummarizer.Implementation.NumberRangeSummarizerImplementation;

public class Test3 {
	
	private NumberRangeSummarizerImplementation NRSM = new NumberRangeSummarizerImplementation();

	@Test
	public void Summary() {
		System.out.println("\n ++++++++++++++++++Test3++++++++++++++++++\n");
		Collection<Integer> testcase = new ArrayList<Integer>();
		String Result = null;
		String testString = "1,3,4.5,6,7,10,4,12,13,15.66,21,26,27,28,29,30";	
		if (testString.contains(".") | testString.contains("[") | testString.contains("\\")| testString.contains("]")) {
			System.out.println("Result: Incorrect format please enter Integer Values or Comma");
			System.out.println("Invalid seperator: " + testString);
			assertTrue(true);
		} else {
			testcase = NRSM.collect(testString);
			Result = NRSM.summarizeCollection(testcase);
			System.out.println("Result: " + Result);
			assertTrue(false);
		}
		System.out.println("\n ===================END===================\n");
	}
}
