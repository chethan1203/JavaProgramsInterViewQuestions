package SampleProgram;

public class ExceptionProgram {

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		try 
		{
		int a = 10/0;
		}
		catch (Exception e)
		{
		System.out.println("Exception catched 1");
		}
		finally
		{
		System.out.println(“Execute finally");
		}
	}
	}
}
