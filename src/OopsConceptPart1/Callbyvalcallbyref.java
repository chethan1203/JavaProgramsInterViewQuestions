package OopsConceptPart1;

public class Callbyvalcallbyref {
	int p;
	int q;
	
	public static void main(String[] args) {
		int x = 20;
		int y = 30;
		// TODO Auto-generated method stub
		Callbyvalcallbyref cbv = new Callbyvalcallbyref();
		cbv.callmethod(x,y);
		cbv.p =10;
		cbv.q =20;
		cbv.swap(cbv);
	}
	
	public void callmethod(int a, int b){
		int s = a + b;
		System.out.println(s);
	}
	
	public void swap(Callbyvalcallbyref t){
		System.out.println("Before swap p: " + t.p);
		System.out.println("Before swap q: " + t.q);
		int tmp;
		tmp= t.q;
		t.q = t.p;
		t.p = tmp;
		System.out.println("After swap p: " + t.p);
		System.out.println("After swap q: " + t.q);
	}
}
