package training.program;

public class Assignment {

	public static void add (int n){
		
		//sum of odd numbers upto n	
		int sum=0;
		


		for(int i=0;i<=n;i++){

			if(i%2!=0){


				sum=sum+i;
			}
		}
		System.out.println(sum);

	
	
	int add=0;
	
	

		for(int j=0;j<=n;j++){

			if(j%2==0){//sum of even numbers upto n


				add=add+j;
			}
		}
		System.out.println(add);
	
	
	int total=0;
	
		for(int s=0;s<=n;s++){

			//sum of  numbers upto n


			total=total+s;
		}

	
	System.out.println(total);

	}	
	public static void main(String[] args) {


		Assignment.add(100);


	}

}
