package OOPS;

public class InheritanceExample extends Inheritance{
	
	
	public void display(){
		System.out.println("hello");
	}

	public static void main(String[] args) {
	InheritanceExample t1=new InheritanceExample();
	InheritanceExample.add();
	t1.a=2;
	System.out.println(t1.a);
	System.out.println(InheritanceExample.b);
	InheritanceExample.b=5;
	System.out.println(InheritanceExample.b);
	t1.display();
	

	}

}
