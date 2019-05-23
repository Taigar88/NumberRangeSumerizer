package numberRangeSummarizer.Test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;


import org.junit.Test;

import numberrangesummarizer.Implementation.NumberRangeSummarizerImplementation;



public class Test1 {
	
	private NumberRangeSummarizerImplementation NRSM = new NumberRangeSummarizerImplementation();
	private String pattern = "[a-zA-Z]";
    
    @Test
    public void Summary() {
    	System.out.println("\n ++++++++++++++++++Test1++++++++++++++++++\n");
    	Collection<Integer> testcase = new ArrayList<Integer>();
    	String Result = null;
    	testcase = NRSM.collect("1,3,4,5,6,7,10,11,12,13,15,20,21,26,27,28,29,30,55");
    	Result = NRSM.summarizeCollection(testcase);
    	System.out.println("Result: " + Result);
        assertTrue(true);  
        
        System.out.println("\n ===================END===================\n");
    }
}
