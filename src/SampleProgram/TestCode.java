package SampleProgram;

public class TestCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,2,3,4,5};
		int fact =1;
		
		for(int i=1;i<=5;i++){
			for(int j=i;j<=5;j++){
					fact = fact *j;
				}
			System.out.println(fact + " : is fact when " + i );
			fact =1;
			}
		
		}	
	}
