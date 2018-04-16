
package javatest;

import java.util.Scanner;


public class no_of_words {
     public static void main(String args[])
     {
	       String s1;
	       Scanner s = new Scanner(System.in);
	        
	       System.out.println("Enter a sentence");
	       s1= s.nextLine();
	       
	       
	       String s2[]=s1.split(" ");
	              
	            System.out.println("Total words ="+(s2.length));
     }
    
}
