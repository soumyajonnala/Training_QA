package training.program;

public class Test4 {
	
	int marks;
	static String city;

	public static void main(String[] args) {
		Test3 t3=new Test3();
		t3.empno=101;
		System.out.println(t3.empno);
		
		Test4 t4=new Test4();
		t4.marks=95;
		System.out.println(t4.marks);
 
		Test4.city="warangal";
		System.out.println(Test4.city);
		t4.add();
		Test4.details();
	}
	
	public void add(){
		float s=0.2f;
		System.out.println(s);
	}
	
	public static void details(){
		double r=4.899;
		System.out.println(r);
	}

}
