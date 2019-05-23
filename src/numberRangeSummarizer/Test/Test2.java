package numberRangeSummarizer.Test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

import numberrangesummarizer.Implementation.NumberRangeSummarizerImplementation;

public class Test2 {
	private NumberRangeSummarizerImplementation NRSM = new NumberRangeSummarizerImplementation();
	private String pattern = "[a-zA-Z]";

	@Test
	public void Summary() {
		
		System.out.println("\n ++++++++++++++++++Test2++++++++++++++++++\n");
		Collection<Integer> testcase = new ArrayList<Integer>();
		String Result = null;
		String testString = "1,3,4,5,6,7,10,t,12,13,15,h,21,26,27,28,29,30,x";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(testString);
		
		if (m.find()) {
			System.out.println("Result: Incorrect format please enter Integer Values or Comma");
			System.out.println("Incorrect variables: " + testString);
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
