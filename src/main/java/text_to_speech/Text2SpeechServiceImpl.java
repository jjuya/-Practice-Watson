package text_to_speech;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ibm.watson.developer_cloud.text_to_speech.v1.TextToSpeech;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.Voice;

@Component("service")

public class Text2SpeechServiceImpl extends TextToSpeech 
									implements Text2SpeechService{

	// constructor
	public Text2SpeechServiceImpl() {
		setUsernameAndPassword("c58778da-81f2-47a4-991e-f99459a065d1", "NX0F8bca6WG2");
	}
	
	// method
	public List<Voice> getVoiceList() throws Exception {		
		
		return getVoices().execute();
	}
	
} //end class
