package numberRangeSummarizer.Test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

import numberrangesummarizer.Implementation.NumberRangeSummarizerImplementation;
import numberrangesummarizer.Tools.NumberRangeSummarizerCheckDuplicates;



public class Test5 {
	
	private NumberRangeSummarizerCheckDuplicates DUP = new NumberRangeSummarizerCheckDuplicates();
	private NumberRangeSummarizerImplementation NRSM = new NumberRangeSummarizerImplementation();
	
	@Test
	public void Summary() {
		
		System.out.println("\n ++++++++++++++++++Test5++++++++++++++++++\n");
		Collection<Integer> testcase = new ArrayList<Integer>();
		String Result = null;
		String testString = "1,3,4,5,6,7,10,12,13,15,6,21,26,27,28,29,30,21";
		testcase = NRSM.collect(testString);
		
		if (DUP.uniqueCharacters(testcase)) {
			testcase = NRSM.collect(testString);
			Result = NRSM.summarizeCollection(testcase);
			System.out.println("Result: " + Result);
			assertTrue(false);			
		} else {
			System.out.println("Duplicate values please double check");
			System.out.println("Incorrect variables: " + testString);
			
			System.out.println("Same implementation as main class. Duplcates will run as singular ranges if permitted");
			assertTrue(true);
		}
		System.out.println("\n ===================END===================\n");
	}
}
