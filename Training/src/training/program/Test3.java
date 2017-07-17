package training.program;

public class Test3 {
	
	int empno;
	
	static String empname;

	public static void main(String[] args) {
		
		Test3 t3=new Test3();
		
		t3.empno=100;
		
		System.out.println(t3.empno);
		
		Test3.empname="soumya";
		
		System.out.println(Test3.empname);
		t3.add();
		Test3.display();
		
		Test4 t4=new Test4();
		t4.marks=95;
		System.out.println(t4.marks);
		
		Test4.city="hanamkonda";
		System.out.println(Test4.city);
		
		t4.add();
		Test4.details();
		
	
		}
	
	public void add(){
		int b=20;
		System.out.println(b);
		
	}
	
	public static void display(){
		String name="sweety";
		System.out.println(name);
	}

}
