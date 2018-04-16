/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;
import java.io.*;

public class Javatest {

    
    public static void main(String[] args) throws IOException {
      File f=new File("C:\\Users\\ji\\Desktop\\test1.txt");
        System.out.println(f.exists());
        
        FileWriter fw= new FileWriter(f);
        fw.write("C:\\Users\\ji\\Desktop\\test1.txt");
        fw.flush();
        fw.close();
        FileReader fr= new FileReader(f);
        int c;
        while((c=fr.read())!=-1)
        {
            System.out.print((char)c);
        }
    }
    
}
