import java.util.Scanner;

public class display_Details {

	public static void main(String[] args) {
		String Name ;
		double percentage;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter your name");
				Name=sc.nextLine();
				
				
				Scanner sc1=new Scanner(System.in);
				System.out.println("Enter your Percentage");
				percentage= sc1.nextDouble();
				
				System.out.println("My  name is  :"+Name);
				System.out.println("and My  perecentage :"+percentage);
	}

}


/* Output :
 
Enter your name
Teju
Enter your Percentage
75
My  name is  : Teju
and My  perecentage  is : 75.0
*/