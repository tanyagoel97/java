package javatest;


public class pattern3 {
    public static void main(String[] args)
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=6-i;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}
