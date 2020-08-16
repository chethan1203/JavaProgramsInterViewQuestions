package JavaBestExamples85;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReturnDuplicateInList {

	public static void main(String[] args) {
		//  Write code to filter duplicate elements from an array and print as a list
		ArrayList<String> list = new ArrayList<String>();
		
		//Form a list from 0-9
		for(int i=0;i<10;i++){
			list.add(String.valueOf(i));
		}
		
		//add emelement to the list 0-5
		for(int i= 0;i<5;i++){
			list.add(String.valueOf(i));
		}
		
		System.out.println("The input List " + list);
		System.out.println("\nFiltered duplicates : " + processList(list));
	}
	public static Set<String> processList(List<String> listContainingDuplicates){
		final Set<String> returnlist = new HashSet<String>();
		final Set<String> templist = new HashSet<String>();
		for(String yinput : listContainingDuplicates){
			if(templist.add(yinput)==false){
				returnlist.add(yinput);
			}
		}
		return returnlist;
	}
}
