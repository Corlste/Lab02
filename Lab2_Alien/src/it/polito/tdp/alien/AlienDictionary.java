package it.polito.tdp.alien;

import java.util.ArrayList;
import java.util.List;

public class AlienDictionary {
	
	public List<Word> dictionary;

	public AlienDictionary() {
		this.dictionary = new ArrayList<Word>();
	}
/**
 * adds a word to the dictionary or updates it
 * @param alien
 * @param trans
 */
	public void addWord(String alien, String trans) {
		for (Word w:dictionary) {
			if (w.compare(alien)) {
				w.setTranslation(trans);
				return;
			}
		}
	}
	
	public String translateWord(String alien) {
		for (Word w:dictionary) {
			if (w.compare)
		}
		return null;
		
	}
}
