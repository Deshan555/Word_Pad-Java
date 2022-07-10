package Core;

import com.sun.speech.freetts.Voice;

import com.sun.speech.freetts.VoiceManager;

public class tts_Engine implements Runnable
{

    @Override
    public void run() 
    {
        Voice voice;//Creating object of Voice class
        
        voice = VoiceManager.getInstance().getVoice("kevin");//Getting voice
        
        if (voice != null) 
        {
            voice.allocate();//Allocating Voice
        }
        try 
        {
            
            voice.setStyle("casual");
        
            voice.setRate(200);//Setting the rate of the voice
            
            voice.setPitch(100);//Setting the Pitch of the voice
            
            voice.setVolume(3);//Setting the volume of the voice 
            
            voice.speak(UI.display.getSelectedText());//Calling speak() method
   
        }
        catch(Exception e)
        {
       	 e.printStackTrace();
        }
        
    }
}
