package com.dmj.godlike.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dmj.godlike.beans.Words;



@Mapper
public interface WordsBase {

	public int insert(Words words);

	public List<Words> selectAll();

	public Words selectById(int wordID);

}
