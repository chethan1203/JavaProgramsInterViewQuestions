package JavaBestExamples85;

public class OctTodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(octdecimal(116));
	}
	
	public static int octdecimal(int num){
		int octdeci = 0;
		int i = 0;
		int reminder = 0;
		while(num!=0){
			reminder = num % 10;
			num = num/10;
			octdeci = (int) (octdeci + (reminder * Math.pow(8, i)));
			++i;
		}
		return octdeci;
	}
}
