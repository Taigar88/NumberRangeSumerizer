package numberrangesummarizer.Tools;

import java.util.ArrayList;
import java.util.List;

public class NumberRangeSummarizerStringBuilder {

	private static List<String> Result;
	
	
	public String Build(List<List<Integer>> input) {
		String finalResult = "";
		Result = new ArrayList<String>();
		for (List<Integer> listGroup : input) {
			if (listGroup.size() == 1) {
				Result.add(listGroup.get(0).toString() + ", ");
			}else{
				Result.add(listGroup.get(0).toString() + "-" + listGroup.get(listGroup.size() - 1) + ", ");

			}
			System.out.println(Result);
		}
		
		for (String res : Result) {
			finalResult = finalResult + res;
		}
		finalResult.trim();
		return finalResult.substring(0, finalResult.length()-2);

	}
}
