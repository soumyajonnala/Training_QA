package training.program;

public class Test8Loops {
	
	public static void add(){
		
		for(int i=1;i<=10;i++){
			System.out.println("Deva");
		}
	}
		public static void add(int j){
			
			for(int i=j;i<=10;i++){
				System.out.println("Deva");
			}
		}
		
		public static void add1(){
			int a=2;
			while(a<=5){
			System.out.println("hi");
			a++;
		}
	}	
		
		public static void add2(int j){
			 
			int b=j;
			do{
				System.out.println("hello");
				b++;
			}while(b<=3);
		}
			
		
	public static void main(String[] args) {
		
       Test8Loops.add(8);
       Test8Loops.add1();
       Test8Loops.add2(4);
	}

}
