package SampleProgram;

public class ToTrickyJavaQuestions {

	public static void main(String[] args) {
		//question 1 does not through any error it prints the statement : unary operators		
		//\u000d System.out.println("Will i executed");
		
		//question 2 complie error as qoute missing in last word
//		String s = "one" +1+2+"two" + 3+4+"four" + five";
//		System.out.println(s);
		
		//question 3
		int i = 10 + +11 - -12 + +13 - -14 + +15;
		System.out.println(i);
		//the output will be 75 -- 10 + (+11) -(-12) +(+13)-(-14)+(+15) say (-*-) = +
		
		//fourth question
		String one = "Random";
		String two = "RAndom";
		if(one==two){
			System.out.println("one==two");
		}else{
			System.out.println("one!=two");
		}

	}

}
