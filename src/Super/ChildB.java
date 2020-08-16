package Super;

public class ChildB extends ParentA {

	public ChildB() {
		super();
		// super(6, "BMW");at a time only one super keyword called because
		// 'super' always the 1st statement inside the constructor
		System.out.println("Child class constructor");
	}

	public ChildB(int a) {
		super(8);
		System.out.println("with 1 paramenter " + a);
	}

	public ChildB(int a, String b) {
		super(8, "BMW");
		System.out.println("with 2 paramenter " + a + " " + b);
	}

	public static void main(String[] args) {
		System.out.println(p);
		ChildB child = new ChildB();
		ChildB child1 = new ChildB(5);
		ChildB child2 = new ChildB(8, "Java");
	}

}
