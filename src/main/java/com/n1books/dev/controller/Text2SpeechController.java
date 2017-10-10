package com.n1books.dev.controller;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ibm.watson.developer_cloud.text_to_speech.v1.TextToSpeech;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.Voice;


@Controller
public class Text2SpeechController {

	@RequestMapping("hello")
	public ModelAndView hello() {
		// 기본적으로 WEB-INF의 views를 찾는다.(InternalResourceViewResolver 때문에)
		return new ModelAndView("hello", "msg", "Hello MVC");
	}
	
	@RequestMapping("display")
	public ModelAndView display_voice() {
		TextToSpeech service = new TextToSpeech("c58778da-81f2-47a4-991e-f99459a065d1", "NX0F8bca6WG2");

		List<Voice> voices = service.getVoices().execute();
		
		return new ModelAndView("hello", "voices", voices);
	}
	
	@RequestMapping(value="speaker", method = RequestMethod.GET)
	public void speaker_voice() {
		
	}
} //end class
