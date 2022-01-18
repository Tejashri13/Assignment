import java.util.Scanner;

public class Circle_radius {

	public static void main(String[] args) {
		
		double Area,radius,Circumference;
	
		 Scanner dc = new Scanner(System.in);
	        System.out.print("Enter the radius : ");
	        radius = dc.nextDouble();
              
	        Area = 3.14*radius*radius;
	        System.out.println(" Radius of Circle = " +Area);
	        
	        
	        Circumference = 2 * 3.14 * radius;
	        System.out.println(" Circumference of Circle = " +Circumference);
	        
	        
	}

}



/*

OUTPUT :
--------------

 Enter the radius : 4
 Radius of Circle = 50.24
 Circumference of Circle = 25.12

*/
 
