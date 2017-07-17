package training.program;

public class PractiseProgram {
	
	int number;
	
    static String name;


	public static void main(String[] args) {
		
		int a=2;
		System.out.println(a);
		
	PractiseProgram b;
	
	b=new PractiseProgram();
	
	
	b.number=4;
	name=new String("soumya");
		System.out.println(b.number);
	PractiseProgram.name="soumya";
	
	System.out.println(PractiseProgram.name);
	b.display();
	PractiseProgram.add();

	}
	
	public void display(){
		
		int d=5;
		System.out.println(d);
	}
	
	
	public static void add(){
		
		String name="sandeep";
		System.out.println(name);
	}

}
