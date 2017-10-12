package com.n1books.dev.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ibm.watson.developer_cloud.language_translator.v2.LanguageTranslator;
import com.ibm.watson.developer_cloud.language_translator.v2.model.IdentifiedLanguage;

@Controller
public class LanguageTranslatorController {
	private static final Logger logger = LoggerFactory.getLogger(Text2SpeechController.class);
	
	@RequestMapping("translator")
	public ModelAndView languagetranslator() {
		
		return new ModelAndView("languagetranslator");
	}
	
	@RequestMapping(value="identified", method=RequestMethod.GET)
	public ModelAndView identifiedLang(@RequestParam("text") String text) {
		
		LanguageTranslator service = new LanguageTranslator("78f3a3c1-5e69-479d-a33c-e68523fc51c0", "mkcxYRdFf7TB");
		
		List <IdentifiedLanguage> langs = service.identify(text).execute();
		
		return new ModelAndView("languagetranslator", "lang", langs.get(0).getLanguage());
	}
	
} //end class
