package Java_Basic_Programs;

import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
			System.out.print("Enter The Number:");        
			int num ,i;
			num =s.nextInt();
			
			System.out.println("Multiplication Table Of  " +num + " is : \n");
		        for( i=1; i <= 10; i++)
		        {
		        	
		            System.out.println(num+" * "+i+" = "+num*i);
		        }

	}

}


/*
 OUTPUT :  
------------------------

Enter The Number:7
Multiplication Table Of  7 is : 

7 * 1 = 7
7 * 2 = 14
7 * 3 = 21
7 * 4 = 28
7 * 5 = 35
7 * 6 = 42
7 * 7 = 49
7 * 8 = 56
7 * 9 = 63
7 * 10 = 70

 
*/ 
