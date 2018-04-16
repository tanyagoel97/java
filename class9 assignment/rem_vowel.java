
package javatest;

import java.util.Scanner;


public class rem_vowel {
    public static void main(String[] args)
    {
        String s1,s2;
        System.out.println("enter a string:");
        Scanner s=new Scanner(System.in);
        s1=s.nextLine();
        s2=s1.replaceAll("[aeiouAEIOU]", "");
        System.out.println(s2);
        
    }

    
}
