package OopsConceptPart1;

public class WrapperFunc {

	public static void main(String[] args) {
		
		//String to integer
		String str = "100";
		int num = Integer.parseInt(str);
		System.out.println(num);
		
		//String to Double
		String dbl = "1099.456";
		double j = Double.parseDouble(dbl);
		System.out.println(j);
		
		//String to boolean
		String bool = "true";
		boolean b = Boolean.parseBoolean(bool);
		System.out.println(b);
		
		//can not convert alfnumeric into num using wrapper class
		String numalf = "100SElenium";
		int numb = Integer.parseInt(numalf); //NumberFormatException: For input string: "100SElenium"
	

	}

}
