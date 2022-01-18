package Reactangle;

import java.util.*;
class Area_parameter
{
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        
        float length,breadth,area, Perimeter ;
        
        System.out.println("Enter the length:");
        length=sc.nextFloat();
        
        System.out.println("Enter the breadth:");
        breadth=sc.nextFloat();
        
        
        area =  length * breadth;
        Perimeter = 2*(length + breadth);
        
        System.out.println("Area Of Rectangle : \n "+ "  length * breadth = "  +area );
        System.out.println("Perimeter Of Rectangle : \n "+ " 2*(length + breadth) = "  +Perimeter);
    }
}



/*

OUTPUT :

--------------
Enter the length:
6
Enter the breadth:
8
Area Of Rectangle : 
   length * breadth = 48.0
Perimeter Of Rectangle : 
  2*(length + breadth) = 28.0

*/