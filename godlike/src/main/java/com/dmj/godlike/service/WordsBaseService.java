package com.dmj.godlike.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dmj.godlike.beans.Words;
import com.dmj.godlike.mapper.WordsBase;

@Repository
public class WordsBaseService {

	@Autowired
	private WordsBase wordsBase;

	public int insert(Words words) {

		return wordsBase.insert(words);
	}

	public List<Words> selectAll() {

		return wordsBase.selectAll();
	}

	public Words selectById(int wordID) {

		return wordsBase.selectById(wordID);
	}

}
