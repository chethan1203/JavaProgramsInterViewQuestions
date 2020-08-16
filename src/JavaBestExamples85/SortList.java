package JavaBestExamples85;

import java.util.Arrays;

public class SortList {

	public static void main(String[] args) {
		//Write code to sort the list of strings using Java collection
		String[] inputlist = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
				"aug", "Sep", "Oct", "nov", "Dec" };
		
		//Show list unsoreted
		showList(inputlist);
		
		//sorting the list 
		Arrays.sort(inputlist);
		
		//show the sorted list in 
		System.out.println("\n-------Sorted List-------");
		showList(inputlist);
		
		//sort the List Alphabit case
		Arrays.sort(inputlist, String.CASE_INSENSITIVE_ORDER);
		
		//Sorted with CaseSensitive
		System.out.println("\n-------Sorted List Case sensitive -------");
		showList(inputlist);

	}
	
	public static void showList(String[] array){
		for(String str: array){
			System.out.println(str + " ");
		}
	}

}
