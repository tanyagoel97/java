

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;


public class func {
    ArrayList<String> al=new ArrayList();
     public void fun(File f1) throws IOException
             
    {
        try{
        
        
        
        File[] file=f1.listFiles();
        for(File f:file )
        {
       if(f.isDirectory())
        {
            al.add("directory:"+f.getAbsolutePath().toString());
            fun(f);
 
        }
             else
              {
                  al.add("  files:"+f.getAbsolutePath().toString());
              }
          }
            
    }
    
  catch(IOException e)
  {
      e.printStackTrace();;
  } 
    }
    public void generateCsvFile(String fileName) 
    {
       FileWriter writer = null;


 try {

     writer = new FileWriter(fileName);
     int i=al.size();
     for(int j=0;j<i;j++)
     {
     writer.append(al.get(j));
     writer.append(',');
     writer.append('\n');
     }

     System.out.println("CSV file is created...");

  } catch (IOException e) {
     e.printStackTrace();
  } finally {
        try {
      writer.flush();
      writer.close();
        } catch (IOException e) {
      e.printStackTrace();
}
}
}
}

