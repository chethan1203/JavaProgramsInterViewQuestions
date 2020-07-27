package JavaBestExamples85;

public class DecitoOctal {

	public static void main(String[] args) {
		System.out.println(dectooct(78));

	}
		public static long dectooct(int num){
			long reminder =0;
			long decoct=0;
			int i=1;
			while(num!=0){
				reminder = num % 8;
				System.out.println(reminder);
				num = num/8;
				System.out.println(num);
				decoct = decoct + (reminder * i);
				System.out.println(decoct);
				i*=10;
			}
			return decoct;
		}
}
