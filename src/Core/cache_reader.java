package Core;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.util.Scanner;

public class cache_reader 
{
    public static void reader(String file_name) throws FileNotFoundException
    {   
        FileInputStream fis = new FileInputStream(file_name);

        Scanner output = new Scanner(fis);
        
        String text = null;
        
        UI.display.setText("");

        while (output.hasNext())
        {
            text = output.nextLine();
            
            System.out.print(text);

            UI.display.append(text+"\n");
        }
    }
}
