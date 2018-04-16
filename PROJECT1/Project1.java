

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Project1 {

    public static void main(String[] args) throws IOException {
        
        func c1=new func();
        
        String input_path;
        String path1="";
        String path2="";
        ArrayList<String> a = null;
        int c,m;
       
        
        Scanner s1=new Scanner(System.in);
        System.out.println("enter a path");
        input_path=s1.nextLine();
        File f=new File(input_path);
        File ff = null;
        
        if(f.exists())
        {
        
        FileReader fr= new FileReader(f);
        
        while((c=fr.read())!=10)
        {
           
            
             path1=path1+((char)c);  //reading the first path
        }
            path1=path1.substring(0, (path1.length()-1));// to remove \r
         
             ff=new File(path1);
             
         
           
             
        
        
         while((c=fr.read())!=-1)
        {
           
            
             path2=path2+((char)c);  //reading second path 
        }
         
         c1.fun(ff);    //function call
         
       c1.generateCsvFile(path2);//function call for csv file
        }
        else{
            System.out.println("wrong path");
            
        }    
      
        
        
   }
    
    
}

   
