
package javatest;


public class sort {
    public static void main(String[] args)
    {
        int i,count=0;
        int a[]={1,1,1,1,0,0,1,0};
        int n= a.length;
        for(i=0;i<n;i++)
        {
           if(a[i]==0)
           {
               count++;
           }
        }
        for(i=0;i<count;i++)
        {
            a[i]=0;
        }
        for(i=count;i<n;i++)
        {
            a[i]=1;
        }
       for(i=0;i<n;i++)
       {
           System.out.print(a[i]);
       }
    }
    
}
