package KnowledgeBase;

public class AdharEncap {
	private int age;
	private String name;
	private int ssn;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public static void main(String[] args) {
		AdharEncap adh = new AdharEncap();
		adh.setAge(25);
		adh.setName("Rajesh");
		adh.setSsn(123456);
		
		System.out.println("The name of Applicant " + adh.getName());
		System.out.println("The age of the Applicant " + adh.getAge());
		System.out.println("The age of the Applicant " + adh.getSsn());
		adh.mobile();
	}
	private void bankinfo(){
		System.out.println("This is my info");
	}
	
	public void mobile(){
		bankinfo();
		System.out.println("This is my mobile");
	}
}
