package training.program;

public class MethodsPractise {

	public static void main(String[] args) {
		Test4 t4=new Test4();
		t4.marks=94;
		System.out.println(t4.marks);
		
		MethodsPractise t5=new MethodsPractise();
		t5.add();
		t5.display();
		MethodsPractise.m1();
		t5.display(3);
		int d=t5.add(2, 3);
		System.out.println(d);
		
		String f=MethodsPractise.m1();
		System.out.println(f);
		System.out.println(f);System.out.println(f);

	}
 
	public void display(){
	
	 System.out.println("this is display method");
	 
 }
	public void display(int a){
		
		System.out.println(a);
	}
 
 public void add(){
	 
	 int a=4;
	 System.out.println(a);
 }
 public int add(int a,int b){
	 
	 int c=a+b;
	 return c;
	 
 }
 
 public static String m1(){
	 
	 boolean b=false;
	 System.out.println(b);
	 String e="welcome";
	 return e;
	 
 }
}
