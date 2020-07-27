package OopsConceptPart1;

public class CallByValueCallByReferrence {
	int p;
	int q;
	
	
	public static void main(String args[]){
		CallByValueCallByReferrence clb = new CallByValueCallByReferrence();
		int x= 10;
		int y = 20;
		clb.p = 50;
		clb.q = 60;
		//call by value 
		int disp = clb.sum(x, y);
		System.out.println(disp);
		
		//call by referecne : passing class object reference variable as a parameter 
		clb.swap(clb);
		System.out.println(clb.p); //prints swapped value 50 to 60
		System.out.println(clb.q); //prints swapped value 60 to 50
	}
	public int sum(int a, int b){
		int c = a+b;
		return c;
	}
	
	//passed class name and reference variable as t so t will fetech the properties of class CallByValueCallByReferrence
	public void swap(CallByValueCallByReferrence t){
		int tmp = t.p;
		t.p = t.q;
		t.q = tmp;
	}
}
