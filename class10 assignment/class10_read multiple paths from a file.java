
package javatest;

import java.io.*;


public class java1 {
    public static void main(String[] args) throws IOException {
      File f=new File("C:\\Users\\ji\\Desktop\\test1.txt");
        System.out.println(f.exists());
        
        String path1="";
        String path2="";
        FileReader fr= new FileReader(f);
        int c;
        while((c=fr.read())!=10)
        {
           
            
             path1=path1+((char)c);  //reading the first path 
        }
        int m=fr.read();             //reading the next line character
         while((c=fr.read())!=-1)
        {
           
            
             path2=path2+((char)c);  //reading second path 
        }
         
         
            
    System.out.println(path1);
    System.out.println(path2);
    
 }
}
