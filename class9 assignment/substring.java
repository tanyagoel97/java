
package javatest;

import java.util.Scanner;


public class substring {
    public static void main(String[] args)
    {
        String s1,s2;
        int i,j,len;
        System.out.println("enter a string:");
        Scanner s=new Scanner(System.in);
        s1=s.nextLine();
        len=s1.length();
        System.out.println("substrings are:");
        for(i=0;i<len;i++)
        {
            for(j=1;j<=len-i;j++)
            {
                s2=s1.substring(i, i+j);
                System.out.println(s2);
                
            }
        }
    }
    
}
