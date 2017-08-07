package com.dmj.godlike.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.dmj.godlike.beans.Words;
import com.dmj.godlike.mapper.WordsBase;
import com.dmj.godlike.serviceImp.WordsBaseServiceImp;

@Repository
public class WordsBaseService implements WordsBaseServiceImp {

	@Autowired
	private WordsBase wordsBase;

	@Override
	public int insert(Words words) {

		return wordsBase.insert(words);
	}

	@Override
	public List<Words> selectAll() {

		return wordsBase.selectAll();
	}

	@Override
	public Words selectById(int wordID) {

		return wordsBase.selectById(wordID);
	}

}
