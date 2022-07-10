
package Core;

import java.io.IOException;

public class CMD 
{
    public static void excCommand(String new_dir)
    {
    
        Runtime rt = Runtime.getRuntime();
        
        try 
        {
        rt.exec(new String[]{"cmd.exe","/c","start"});
        
        } 
        catch (IOException e) 
        {
        e.printStackTrace();
        }
    }    
}
