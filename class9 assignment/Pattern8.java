
package javatest;


public class Pattern8 {
    public static void main(String[] args)
    {
        String s1="abc",s2;
        int len=s1.length();
        for(int i=1;i<=len;i++)
        {
            s2=(String) s1.subSequence(0,i);
            System.out.println(s2);
        }
    }

    
}
