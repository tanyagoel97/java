
package javatest;

import java.util.Scanner;


public class search {
    public static void main(String[] args)
    {
        int i,count=0,mid,first,last,e,flag=0;
        int a[]={1,4,6,7,8,9,10};
        Scanner s1=new Scanner(System.in);
        e=s1.nextInt();
        int n= a.length;
        mid=n/2;
        first=0;
        last=n-1;
        while(first<=last)
        {
            mid=(first+last)/2;
            if(a[mid]>e)
            {
                
                last=mid-1;
                
            }
            else if(a[mid]<e)
            {
                first=mid+1;
                
                
            }
            else
            { 
                 flag=1;
                //System.out.println("element found at:"+mid+1);
                break;
            }
            
        }
       if(flag==1)
       {
           System.out.println("element found at :"+(mid+1));
       }
       else
       {
           System.out.println("element not found");
       }
        
    }
    
}
