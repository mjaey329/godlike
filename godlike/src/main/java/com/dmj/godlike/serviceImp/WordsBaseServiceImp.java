package com.dmj.godlike.serviceImp;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmj.godlike.beans.Words;
import com.dmj.godlike.service.WordsBaseService;
import com.dmj.godlike.util.RequestUtil;

import net.sf.json.JSONObject;

@Service
public class WordsBaseServiceImp {

	@Autowired
	private WordsBaseService wordsBase;

	public String insert(HttpServletRequest request) {
		JSONObject jsonObject = JSONObject.fromObject(RequestUtil.toString(request));
		Words words = (Words) JSONObject.toBean(jsonObject, Words.class);
		int i = wordsBase.insert(words);
		if (i != 0) {
			return "success";
		} else
			return "faile";
	}

	public List<Words> selectAll() {
		return wordsBase.selectAll();
	}

	public Words selectById(int wordID) {
		return wordsBase.selectById(wordID);
	}

}
