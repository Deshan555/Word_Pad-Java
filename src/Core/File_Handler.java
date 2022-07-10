package Core;

import java.io.FileNotFoundException;


public class File_Handler 
{
    public static void handle(String extension,String file)
    {
        if(extension.equals("java"))
        {
            System.out.print("Open Java Core Handler");
            
            try 
            {
                cache_reader.reader(file);
            } 
            catch (FileNotFoundException error) 
            {
                System.out.print("ERROR : "+error);
            }
        }
        if(extension.equals("txt"))
        {
            System.out.print("Open Txt Core Handler");
            
            try 
            {
                cache_reader.reader(file);
            } 
            catch (FileNotFoundException error) 
            {
                System.out.print("ERROR : "+error);
            }
        }
        if(extension.equals("srt"))
        {
            System.out.print("Open Txt Core Handler");
            
            try 
            {
                cache_reader.reader(file);
            } 
            catch (FileNotFoundException error) 
            {
                System.out.print("ERROR : "+error);
            }
        }
        if(extension.equals("py"))
        {
            System.out.print("Open Txt Core Handler");
            
            try 
            {
                cache_reader.reader(file);
            } 
            catch (FileNotFoundException error) 
            {
                System.out.print("ERROR : "+error);
            }
        }
        else
        {
            try 
            {
                cache_reader.reader(file);
            } 
            catch (FileNotFoundException error) 
            {
                System.out.print("ERROR : "+error);
            }
        }
                
    }
}
