package SampleProgram;

public class LargeSmallNumber {

	public static void main(String[] args) {
		int[] a = {-10, -28,50, 25, 240, 55667788};
		int large = a[0];
		int small = a[0];
		for(int i = 0; i<a.length;i++){
			if(a[i]> large){
				large = a[i];
			}
			else if(a[i]<small){
				small = a[i];
			}
		}
		System.out.println(large + " Is the large number");
		System.out.println(small + " Is the small number");
	}

}
