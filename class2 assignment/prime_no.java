
package javatest;

import java.util.Scanner;


public class prime_no {
    public static void main(String[] args)
    {
        int num,count=0;
        Scanner s1=new Scanner(System.in);
        num=s1.nextInt();
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
                
            }
        }
        if(count==2)
        {
            System.out.print("prime no");
        }
        else{
           
        System.out.print("not prime");
        }
        }
    }
    

