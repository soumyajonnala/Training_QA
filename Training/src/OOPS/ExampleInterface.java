package OOPS;

public class ExampleInterface implements FirstTest,FirstTest.add{

	public static void main(String[] args) {
		ExampleInterface t3=new ExampleInterface();
		t3.add();
		t3.sum();
		t3.first();
		System.out.println(ExampleInterface.a);
		System.out.println(ExampleInterface.b);
		

	}

	@Override
	public void add() {
		System.out.println("hi");
		
	}

	@Override
	public void display() {
		System.out.println("hi");
		
	}

	@Override
	public void sum() {
		System.out.println("hi");
		
	}

	@Override
	public void first() {
		System.out.println(ExampleInterface.a);
		
	}

}
