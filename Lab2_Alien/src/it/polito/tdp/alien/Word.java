package it.polito.tdp.alien;

public class Word {
	private String alienWord;
	private String translation;
	
	public Word(String alienWord) {
		this.alienWord = alienWord;
	}

	
	public Word(String alienWord, String translation) {
		this.alienWord = alienWord;
		this.translation = translation;
	}


	public boolean compare(String alien) {
		if (alien.equals(alienWord))
			return true;
		return false;
		
	}


	public String getTranslation() {
		return translation;
	}


	public void setTranslation(String translation) {
		this.translation = translation;
	}
	
}
