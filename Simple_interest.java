import java.util.Scanner;
public class  Simple_interest
{
    public static void main(String args[]) 
    {
        float p, r, t,  simple_interest;
        Scanner tn = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = tn.nextFloat();
        
        System.out.print("Enter the Rate of interest : ");
        r = tn.nextFloat();
        
        System.out.print("Enter the Time period : ");
        t = tn.nextFloat();
        
        
        simple_interest = (p * r * t) / 100;
        System.out.print("Simple Interest is = " + "  (p * r * t) / 100 = " + simple_interest);
    }
}






/*

OUTPUT :
---------------------

Enter the Principal : 9
Enter the Rate of interest : 7
Enter the Time period : 9
Simple Interest is =   (p * r * t) / 100 = 5.67

*/
