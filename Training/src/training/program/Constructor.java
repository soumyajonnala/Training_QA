package training.program;

public class Constructor {
	
	private int a;
	private String name;
	
	Constructor(){
		System.out.println("number one");
	}
	
	Constructor(int a){
		System.out.println(a);
	}

	Constructor(int a, String name){
		this.a = a;
		this.name = name;
		System.out.println(a+"."+name);
	}
	
	Constructor(float a,int b){
		float c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Constructor c=new Constructor();
		Constructor d=new Constructor(2);
		Constructor e=new Constructor(2,"soumya");
		Constructor f=new Constructor(0.2f,2);
		

	}

}
