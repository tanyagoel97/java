
package javatest;


import java.util.Scanner;



public class Secondlargest 
{
 
	
public static void main(String[] args) 
{
                 
Scanner s1 =new Scanner(System.in);
		
int arr[]=new int[10];
                
for(int i=0;i<10;i++)
                
{
                   
arr[i]=s1.nextInt(); 
                
}
		
int largest = arr[0];
		
int secondLargest = arr[0];
		
		
System.out.println("The given array is:" );
		
for (int i = 0; i < arr.length; i++) 
{
			
System.out.print(arr[i]+"\t");
		
}
		
for (int i = 0; i < arr.length; i++) 
{
 
			
if (arr[i] > largest) 
{
				
secondLargest = largest;
				
largest = arr[i];
 
			
} else if (arr[i] > secondLargest) 
{
				
secondLargest = arr[i];
 
			
}
		
}
 
		
System.out.println("\nSecond largest number is:" + secondLargest);
 
	
}

}

    

