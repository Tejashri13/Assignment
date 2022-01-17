import java.util.Scanner;
 
public class calculator {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Enter first number: ");
  int num1 = in.nextInt();
   
  System.out.print("Enter second number: ");
  int num2 = in.nextInt();
   
 
  System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
   
  System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
   
  System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
   
  System.out.println(num1 + " / " + num2 + " = " +  (num1 / num2));
 
  System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
 }
 
}




/*
OUTPUT :
-------------------

Enter first number: 5
Enter second number: 4
5 + 4 = 9
5 - 4 = 1
5 x 4 = 20
5 / 4 = 1
5 mod 4 = 1

*/
