package OopsConceptPart1;

public class StaticAndNonStatic {
    String name = "tom"; //non static global vriable
    static int i  = 20; //static variable
    //static variables and static methods are not part of objects
    //Separate memory will be allocated to static methods and variables in a class file 
	
	public static void main(String[] args) {
		StaticAndNonStatic stat = new StaticAndNonStatic();
		stat.mail();
		sendmail();
		System.out.println(stat.name);
		System.out.println(i);
	}

	public void mail(){
		
	}
	
	public static void sendmail(){
		System.out.println("This is static");
	}
}
