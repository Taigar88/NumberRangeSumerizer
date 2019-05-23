package numberRangeSummarizer.Test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

import numberrangesummarizer.Implementation.NumberRangeSummarizerImplementation;

public class Test4 {

	private NumberRangeSummarizerImplementation NRSM = new NumberRangeSummarizerImplementation();

	@Test
	public void Summary() {
		System.out.println("\n ++++++++++++++++++Test4++++++++++++++++++\n");
		Collection<Integer> testcase = new ArrayList<Integer>();
		String Result = null;
		String testString = "1,3,4,5,6,7,10,12,,,,13,15,66,21,26,27,28,29,30";
		System.out.println("Before replace: " + testString);
		testString = testString.replaceAll(",{2,}", ",");
		System.out.println("After replace: " + testString);
    	testcase = NRSM.collect(testString);
    	Result = NRSM.summarizeCollection(testcase);
    	System.out.println("\nCater for mistakes in amount of sequencial commas");
    	System.out.println("\nResult: " + Result);
          
        
		System.out.println("\n ===================END===================\n");
		assertTrue(true);
	}
}
