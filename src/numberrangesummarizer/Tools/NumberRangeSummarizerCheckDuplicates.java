package numberrangesummarizer.Tools;

import java.util.Arrays;
import java.util.Collection;

public class NumberRangeSummarizerCheckDuplicates {

 public boolean uniqueCharacters(Collection<Integer> str) 
 { 	
	 int[] IntArray = new int[str.size()+1];
	 int count = 0;
	 for (int value: str) {
		 IntArray[count] = value;
		 count ++;
	 }

     Arrays.sort(IntArray); 

     for (int i = 0; i < IntArray.length - 1; i++) { 
         // if the adjacent elements are not 
         // equal, move to next element 
         if (IntArray[i] != IntArray[i + 1]) 
             continue; 

         else
             return false; 
     } 
     return true; 
 } 
}
