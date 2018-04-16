
package javatest;

import java.util.Scanner;


public class leap_yr {
    public static void main(String[] args)
    {
        int year;
        Scanner s1 =new Scanner(System.in);
        year=s1.nextInt();
        if(year%4==0&&year%100!=0)
        {
          
            System.out.print("leap yr");  
        }
        else if(year%400==0)
        {
            System.out.print("leap yr");
        }
        else{
            System.out.print("not a 1leap yr");
        }
    }
    
}
