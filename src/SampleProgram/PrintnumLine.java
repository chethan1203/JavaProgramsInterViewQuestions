package SampleProgram;

public class PrintnumLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("********************");
		//fibnacci series up to 10
		int a =1,b=1,fib=0,num=10;
		for(int i=1;i<=num;i++){
			System.out.println(a + " ");
			fib = a+b;
			a=b;
			b=fib;
		}
		System.out.println("********************");
		String str = "selenium";
		int numb = str.length();
		String rev="";
		for(int i=numb-1;i>=0;i--){
			rev = rev + str.charAt(i); 
		}
		System.out.println(rev);
		System.out.println("*********Largest number***********");
		int[] arr= {-1,0,28,3,15,9,17,4,23,2};
		int val = 0; //we can declar as val=arr[0]
		for(int i=0;i<arr.length;i++){
			if(arr[i]>val){
				val = arr[i];
			}
		}
		System.out.println("The largest number is " + val);
		System.out.println("*********prime number 1 tp 100***********");
		int i =0;
	    int n =0;
	       String  primeNumbers = "";
	 
	       for (i = 1; i <= 100; i++){      
	          int counter=0;   
	          for(n =i; n>=1; n--){
	             if(i%n==0){
	             counter = counter + 1;
	             }
	          }
	  if (counter ==2){
	     primeNumbers = primeNumbers + i + " ";
	  }
	       }
	       System.out.println("Prime numbers from 1 to 100 are :");
	       System.out.println(primeNumbers);
		
	}

}
