package ExceptionPrac;

public class ThrowException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is test");
		try{
			throw new Exception("my croped exception");
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("my except");
		
	}

}
