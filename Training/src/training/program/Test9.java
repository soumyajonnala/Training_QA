package training.program;

public class Test9 {
	
	public static Test display(){//method that  returns a type of class
		
		Test a=new Test();
		
		 
		return a;//a is not visible outside of the method.Hence we should assign a new variable's' to get the return value
		
		
		
	}

	public static void main(String[] args) {
		
	  
      Test s=Test9.display();
      System.out.println(s.name="d");
      
      
      

	}

}
