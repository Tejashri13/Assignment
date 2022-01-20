import java.util.Scanner;

public class Cube_of {

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter number:");
		num = sc.nextInt();
		
	        if (num % 5 == 0)
	  
	        {
	            System.out.println("Yes \n"  + num + " is divisible by 5");
	            System.out.println("Number is : " +num +" and cube of " +num +" is : "+(num*num*num)); 
	        }
	        
	       
	        else
	        {
	            System.out.println("No, It is not divisible by 5");
	        }
	}

}



/*
  
OUTPUT : 
----------------
 
Enter number:
65
Yes 
65 is divisible by 5
Number is : 65 and cube of 65 is : 274625

*/



