package com.n1books.dev.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ibm.watson.developer_cloud.text_to_speech.v1.TextToSpeech;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.Voice;

// Spring 4부터 사용 가능
// jason으로 출력되는 것
// data를 전송 할 때만. view를 거치면 안된다.
@RestController
public class Text2SpeechRestController {
	private static final Logger logger = LoggerFactory.getLogger(Text2SpeechController.class);
	
	@Autowired
	private Text2SpeechService service;
	
	@RequestMapping("displayJSON")
	public List<Text2SpeechVO> display_voice() throws Exception {
				
		return service.getText2SpeechList();
	}

} //end class
