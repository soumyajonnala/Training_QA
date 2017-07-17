package TestingApps;

public class Loops {

	public static void main(String[] args) {
		 int a,b,c;
		 a=1;
		 b=1;
		 c=a+b;
		 System.out.println(a);
		 System.out.println(b);
		 while(c<=100){
			 System.out.println(c);
			 a=b;
			 b=c;
			 c=a+b;

	}

}
}