package ezen0223.first.ch15.first;

import java.util.ArrayList;
import java.util.List;


public class ExLanguae {

	public static void main(String[] args) {
		
		ArrayList<Language> arrayList = new ArrayList<Language>();
		
//		List<Language> languages = new ArrayList<>();
		
		List<String> listStrings = new ArrayList<>();
			
		listStrings.add("Stark");
		listStrings.add("Tony");
		
		for(int i =0; i<listStrings.size(); i++) {
			System.out.println(listStrings.get(i));
		}
		for(String listString: listStrings) {
			System.out.println(listString);
		}
		
		System.out.println("-------");
		
		List<Language> languages = new ArrayList<>();
		
		Language language1 = new Language();
		
		Language language2 = new Language();
		
		languages.add(language1);
		languages.add(language2);
		languages.add(new Language("EN,2", 2));
		
		for(Language language: languages) {
			System.out.println(language.getName() + " | " + language.getVersion());
		}
	}

}
