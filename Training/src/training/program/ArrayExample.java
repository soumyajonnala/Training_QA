package training.program;

public class ArrayExample {

	public static void main(String[] args) {
		
		int[] a = new int[]{10, 20, 30};
		int[] c=  new int[]{40,50,60};
		m2(c);
		m2(a);
		System.out.println("args"+args.length);//example for main(String[] args) {
		
		for(String name : args){
			System.out.println("name "+name );
		}
	}
	
	public static void m2(int[] b){
		/*for(int element : b){
			System.out.println("Element .."+element);
			
		}*/
		System.out.println("Element .."+b[0]);
	}

}
