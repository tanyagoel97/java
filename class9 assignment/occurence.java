
package javatest;

import java.util.Scanner;


public class occurence {
    public static void main(String args[])
    {
        
        String s1="",s2="";
        Scanner s=new Scanner(System.in);
        System.out.println("enter 1st String:");
        s1=s.nextLine();
        System.out.println("enter 2nd String:");
        s2=s.nextLine();
        if(s1.contains(s2))
        {
            System.out.println("It contains the given substring");
            
        }
        else
            System.out.println("It does not contains the given substring");
    }
    
}
