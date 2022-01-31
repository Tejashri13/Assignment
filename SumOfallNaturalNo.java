package Java_Basic_Programs;

import java.util.Scanner;

public class SumOfallNaturalNo {

	public static void main(String[] args) {
		
		
	  Scanner sc=new Scanner(System.in);
		        int num ,sum = 0;
		        System.out.println("Enter the number :");
		        num=sc.nextInt();    
		          
		        for(int i=0; i<=num;i++)
		        {
		            sum = sum+i;
		        }
		        System.out.println("The sum of natural numbers is = " +sum);
		     }
			
	}




/*
  OUTPUT :
  
  -------------------
 
  Enter the number :
  6
  The sum of natural numbers is = 21
  
  ---------------------
   
  Enter the number :
  5
  The sum of natural numbers is = 15 

 */


