
package javatest;

import java.util.Scanner;


public class primeno_upto_N {
    public static void main(String[] args)
    {
        int num,i,count;
        Scanner s1=new Scanner(System.in);
        num=s1.nextInt();
        for(i=1;i<=num;i++)
        {
            count=0;
             for(int j=1;j<=i;j++)
        {
            if(i%j==0)
            {
                count++;
                
            }
        }
        if(count==2)
        {
            System.out.println(i);
        }
        
        }
    }
}
