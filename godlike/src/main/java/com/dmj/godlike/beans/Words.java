package com.dmj.godlike.beans;

import java.util.Date;

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

	/** Word CreateTime */
	private Date wordCreateTime;

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

	public Date getWordCreateTime() {
		return wordCreateTime;
	}

	public void setWordCreateTime(Date wordCreateTime) {
		this.wordCreateTime = wordCreateTime;
	}

	public Words(int wordID, String wordE, String wordC, Date wordCreateTime) {
		super();
		this.wordID = wordID;
		this.wordE = wordE;
		this.wordC = wordC;
		this.wordCreateTime = wordCreateTime;
	}

	@Override
	public String toString() {
		return "Words [wordUID=" + wordUID + ", wordID=" + wordID + ", wordE=" + wordE + ", wordC=" + wordC
				+ ", wordCreateTime=" + wordCreateTime + "]";
	}

}
