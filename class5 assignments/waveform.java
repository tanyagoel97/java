
package javatest;



public class waveform 
{
    
public static void main(String[] args) 
{
 
		
int arr[] = { 1,2,3,4,5,6,7,8,9,10 };
                
System.out.println("The given array is:" );
		
for (int i = 0; i < arr.length; i++)
               
 {
			
System.out.print(arr[i]+"\t");

    
}
                
for(int i=0;i<arr.length-1;i=i+2)
                
{
                    
int temp=arr[i];
                    
arr[i]=arr[i+1];
                    
arr[i+1]=temp;
                    
                
}
                
System.out.println("The waveform array is:" );
		
for (int i = 0; i < arr.length; i++)
                
{
			
System.out.print(arr[i]+"\t");

    
}

}
}
    

