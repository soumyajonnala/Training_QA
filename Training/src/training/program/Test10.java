package training.program;

public class Test10 {
	
	int a;
	
	Test t10;
	Test tDisplay;
	
	public Test10(){
		
		t10=new Test();
		
		
	}
	public void display(){
		tDisplay=new Test();
	}

	public static void main(String[] args) {
		Test10 t11=new Test10();
		t11.t10.name="deva";
		System.out.println(t11.t10.name);
		t11.display();
		t11.tDisplay.name="soumya";
		System.out.println(t11.tDisplay.name);

	}

}
