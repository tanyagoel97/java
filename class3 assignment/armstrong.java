
package javatest;

import java.util.Scanner;


public class armstrong {
    public static void main(String[] args)
    {
        int num,rem,temp,sum=0;
        Scanner s1=new Scanner(System.in);
        num=s1.nextInt();
        int temp1=num;
        
        while(num>0)
        {
           rem=num%10;
           temp=rem*rem*rem;
           sum=sum+temp;
           num=num/10;
        }
        if(temp1==sum)
        {
            System.out.println("armstrong no");
        }
        else
        {
            System.out.println("not an armstrong no");
        }
    }
    
}
