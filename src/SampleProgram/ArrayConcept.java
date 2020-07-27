package SampleProgram;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//disadvantage of arry 
		//1. Static in nature ie. size is fixed
		//2. stores only similar data types - to over come this problem we use collection ex: Array list, Hashtable[dynamic array],
		
		int[] a = {10,20,30,40};
		int b[] = new int[4];
		b[0] = 10;
		b[1] =20;
		b[2] =30;
		b[3]=40;
		
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);	
	}
		System.out.println("*****************");
		for(int j=0;j<b.length;j++){
			System.out.println(b[j]);	
	}
		char c[] = new char[4];
		c[0] = 'a';
		c[1] = '$';
		c[2] = '1';
		c[3] = 'c';
		System.out.println("*****************");
		for(int k=0;k<c.length;k++){
			System.out.println(c[k]);	
	}
		double d[] = new double[4];
		d[0] = 22.45;
		d[1] = 12345;
		d[2] = 33.4456;
		d[3] = 1234677;
		System.out.println("*****************");
		for(int l=0;l<c.length;l++){
			System.out.println(d[l]);	
	}
		boolean e[] = new boolean[2];
		e[0] =false;
		e[1] =true;
		
		String s[] = new String[4];
		s[0] = "chethan";
		s[1] = "rashmi";
		s[2] ="Avyakkth";
		s[3] = "Family";
		
		System.out.println("*****************");
		for(int m=0;m<c.length;m++){
			System.out.println(s[m]);	
	}
		
		//object Array
		Object obj[]= new Object[6];
		obj[0] = "chethan";
		obj[1] = 1;
		obj[2] = "a";
		obj[3] = 123;
		obj[4] = 1234.567;
		obj[5] = false;
		
		System.out.println("*****************");
		for(int n=0;n<obj.length;n++){
			System.out.println(obj[n]);	
	}
	}
	
}
