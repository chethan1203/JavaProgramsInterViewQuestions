package SampleProgram;

public class FindTop2maxnumber {

	public static void main(String[] args) {
		int maxnum1 = 0;
		int maxnum2 =0;
		int[] a = {10,5,20,35,1,100,200,2};
		for(int i=0;i<a.length;i++){
			if(maxnum1<a[i]){
				maxnum2=maxnum1;
				maxnum1= a[i];
			}else if(maxnum2<a[i]){
				maxnum2 = a[i];
			}
		}
		System.out.println("The first highest number: " + maxnum1);
		System.out.println("The first highest number: " + maxnum2);
	}
}