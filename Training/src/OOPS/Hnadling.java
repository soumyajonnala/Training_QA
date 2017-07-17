package OOPS;

public class Hnadling {
	
	public static void dostuff() throws InterruptedException{
		Hnadling.domorestuff();
	}
	
	
	public static void domorestuff() throws InterruptedException{
		Thread.sleep(20);
	}

	public static void main(String[] args) throws InterruptedException {
		dostuff();

	}

}
