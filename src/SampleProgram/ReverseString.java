package SampleProgram;

public class ReverseString {

	public static void main(String[] args) {
	String str = "Avyakkth";
	String rev = "";
	int len = str.length();
	for(int i= len-1;i>=0;i--){
		rev = rev+ str.charAt(i); 
	}
	System.out.println("The loop reverse : " + rev);
	System.out.println("The StringBuffer : " + new StringBuffer(str).reverse());
	}
}
