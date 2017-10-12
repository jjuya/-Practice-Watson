package language_translator;

import java.util.List;

import com.ibm.watson.developer_cloud.language_translator.v2.LanguageTranslator;
import com.ibm.watson.developer_cloud.language_translator.v2.model.IdentifiedLanguage;

public class LanguageTranslatorTest {

	public static void main(String[] args) {
		LanguageTranslator service = new LanguageTranslator("78f3a3c1-5e69-479d-a33c-e68523fc51c0", "mkcxYRdFf7TB");
		
		String test = "this is a test これはテストです";
		
		List <IdentifiedLanguage> langs = service.identify(test).execute();
		
		for(IdentifiedLanguage l : langs) {
			System.out.println(l.getConfidence() + " / " + l.getLanguage());
		}
		
	} //end class
} //end main
