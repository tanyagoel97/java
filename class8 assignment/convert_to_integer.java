
package javatest;

import java.util.Scanner;


public class convert_to_integer {
    public static void main(String[] args)
    {
        String s1,s2;
        Scanner s=new Scanner(System.in);
        s1=s.nextLine();
        s2=s.nextLine();
        System.out.println("concatenation:"+(s1+s2));
        int m1=Integer.parseInt(s1);
        int m2=Integer.parseInt(s2);
        System.out.println("sum:"+(m1+m2));
        
        
    }
    
}
