package training.program;

public class Test7 {
	int height;
	
	String name;
	
	Test7(int height,String name){
		
		this.height=height;//initialisation
		this.name=name;
		
		System.out.println(this.height+"ft-"+this.name);
		
		System.out.println(height+"ft-"+name);
	}

	
	public static void main(String[] args) {
		
		
		Constructor c=new Constructor();
		
		Constructor e=new Constructor(1,new String("sandeep"));
		
		Test7 t7=new Test7(5,"soumya");
		Test7 t3=new Test7(4,"devansh");
	//Constructor f=new Constructor(2.2f,5);
		t7.display();
		

	}
	public void display(){
		System.out.println(height+"ft-"+name);
	}

}
