import java.io.*;


public class fileh
{
	public static void main(String args[])
	{ 
       //for text file
        
        File f = new File("F:/abc.txt");
        
        
        System.out.println(f.exists()); //to check whether file is exists or not.
        
        System.out.println(f.getName()); //to get name of the file
        
        System.out.println(f.length()); //to find lenght of file
        
        System.out.println(f.canRead()); 
        
        System.out.println(f.canWrite());
        
        System.out.println(f.getParent());
        
        System.out.println(f.getPath());
        
        System.out.println(f.isFile());  //to represent file 
        
        System.out.println(f.isDirectory()); //to represent folder
        
        try 
            {
                FileOutputStream font = new FileOutputStream(f);
                
                String s = "Hello Java,hello git";
            
                char ch[]= s.toCharArray();
            
                for(int i =0; i<s.length();i++)
                {
                    font.write(ch[i]);
                       
                }
                font.close();
            }
        
        catch(IOException e)
            {
       
                System.out.println(e);
            }
        
          try 
            {
                FileInputStream fin = new FileInputStream(f);
                
                int i;
            
                i = fin.read();
            
                while(i != -1)
                {
                     System.out.println(i + ":" + (char)i);
                    i = fin.read();
                }
        
            fin.close();
          }
        catch(IOException e)
            {
                System.out.println(e);
            }
     //for folder
        
        File k = new File("C:/Users/Abhishek Singh/Desktop/java project");
        
           System.out.println(k.exists()); //to check whether folder is exists or not.
        
        System.out.println(k.getName()); //to get name of the folder
        
        System.out.println(k.length()); //to find lenght of folder
        
        System.out.println(k.canRead()); 
        
        System.out.println(k.canWrite());
        
        System.out.println(k.getParent());
        
        System.out.println(k.getPath());
        
        System.out.println(k.isFile());  //to check whether is file or not 
        
        System.out.println(k.isDirectory()); //to check whether is folder or not
        
        
        for( String s1 : k.list())
            {
                    System.out.println(s1);  //display content of the folder
            }
    }
    
}


