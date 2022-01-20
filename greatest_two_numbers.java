import java.util.Scanner;

public class greatest_two_numbers {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		
		System.out.println("Enter 1st number :");
		num1 = sc.nextInt();
		
		System.out.println("Enter 2nd number :");
		num2 = sc.nextInt();
		
		if(num1 > num2)
			
		System.out.print( +num1 + " is greater Number" );
		else
			
		System.out.print( +num2 + " is greater Number " );
		}
	
	}



/*
 
OUTPUT :

----------------

Enter 1st number :
78
Enter 2nd number :
90
90 is greater Number

*/

