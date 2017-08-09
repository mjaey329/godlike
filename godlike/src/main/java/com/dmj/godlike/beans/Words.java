package com.dmj.godlike.beans;


/**
 * @author dmj
 * @version 创建时间：2017年8月2日 下午4:31:27 所有单词实体类
 */
public class Words {

	/** Word UID */
	private int wordUID;

	/** Word ID */
	private int wordID;

	/** Word Engilish */
	private String wordE;

	/** Word Chineses */
	private String wordC;

	public int getWordUID() {
		return wordUID;
	}

	public void setWordUID(int wordUID) {
		this.wordUID = wordUID;
	}

	public int getWordID() {
		return wordID;
	}

	public void setWordID(int wordID) {
		this.wordID = wordID;
	}

	public String getWordE() {
		return wordE;
	}

	public void setWordE(String wordE) {
		this.wordE = wordE;
	}

	public String getWordC() {
		return wordC;
	}

	public void setWordC(String wordC) {
		this.wordC = wordC;
	}

	public Words(int wordUID, int wordID, String wordE, String wordC) {
		super();
		this.wordUID = wordUID;
		this.wordID = wordID;
		this.wordE = wordE;
		this.wordC = wordC;
	}
	
	public Words() {
		
	}

	@Override
	public String toString() {
		return "Words [wordUID=" + wordUID + ", wordID=" + wordID + ", wordE=" + wordE + ", wordC=" + wordC;
	}

}
