package com.dmj.godlike.serviceImp;

import java.util.List;

import com.dmj.godlike.beans.Words;

public interface WordsBaseServiceImp {

	public int insert(Words words);

	public List<Words> selectAll();

	public Words selectById(int wordID);

}
