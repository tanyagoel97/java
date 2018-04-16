
package javatest;

import java.util.Scanner;


public class even_no {
    public static void main(String[] args)
    {
       int num;
       Scanner s1=new Scanner(System.in);
       num=s1.nextInt();
       for(int i=2;i<=num;i++)
       {
           if(i%2==0)
           {
               System.out.println(i);
           }
       }
    }
}
