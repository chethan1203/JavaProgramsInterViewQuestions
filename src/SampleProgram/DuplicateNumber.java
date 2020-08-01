package SampleProgram;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {
	public static void main(String args[]){
		int a[] = {1,2,4,5,6};
		
		//duplicate number in array
		int b[] = {1,2,4,5,6,1,4};
		int sum =0;
		for(int i=0;i<a.length;i++){
			sum =sum+a[i];
		}
		int sum1 =0;
		for(int j=0;j<=6;j++){
			sum1 = sum1+j;
		}
		System.out.println("The missing number is " +(sum1-sum));
		
		Set<Integer> it = new HashSet<Integer>();
		for(Integer num : b){
			if(it.add(num)==false){
				System.out.println("The num repeated :" +num);
			}
		}
		
	}
}
