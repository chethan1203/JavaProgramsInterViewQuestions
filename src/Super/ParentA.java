package Super;

public class ParentA {
	
	static int p =200;
	
	public ParentA(){
		System.out.println(p);
		System.out.println("This is a default constructor");
	}
	
	public ParentA(int a){
		System.out.println("The even number is : " + a);
	}
	
	public ParentA(int p, String b){
		p = this.p;
		System.out.println("The even number is : " + p);
		System.out.println("The name of car : " + b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
