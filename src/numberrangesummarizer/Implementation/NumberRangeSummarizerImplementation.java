package numberrangesummarizer.Implementation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import numberrangesummarizer.Interface.NumberRangeSummarizer;
import numberrangesummarizer.Tools.NumberRangeSummarizerStringBuilder;

public class NumberRangeSummarizerImplementation implements NumberRangeSummarizer {
	
	private NumberRangeSummarizerStringBuilder StringBuilder = new NumberRangeSummarizerStringBuilder();
	private static String Result; 
	//collect the input
	public Collection<Integer> collect(String input){
		List<Integer> numberList = new ArrayList<Integer>();
		String[] list;
		list = input.split("\\s*,\\s*");
		for(String listSet: list) {
			numberList.add(Integer.parseInt(listSet));
		}
		Collections.sort(numberList);
		return numberList;
    }

    //get the summarized string
    public String summarizeCollection(Collection<Integer> input) {
    	
    	List<List<Integer>> listMain = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>(input);
        for (int i = 0; i < input.size(); i++) {
            if ((i + 1<temp2.size())&&( temp2.get(i) + 1==temp2.get(i + 1))) {
                temp.add(temp2.get(i));
            } else {
                temp.add(temp2.get(i));
                listMain.add(temp);
                temp  = new ArrayList<>();
            }

        }
        temp.clear();
        temp2.clear();
        Result = StringBuilder.Build(listMain);
        listMain.clear();
        System.out.println(Result);
    	return Result;
    }
}
