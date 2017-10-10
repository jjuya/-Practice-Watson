package text_to_speech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextToSpeechTest2 {

	public static void main(String[] args) {

		//Text2SpeechService service = new Text2SpeechServiceImpl();
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("text_to_speech/beaninit.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("beaninit.xml", TextToSpeechTest2.class);
		Text2SpeechService service = (Text2SpeechService)context.getBean("service");
		
		try {
			System.out.println(service.getVoiceList());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} //end main
} //end class
