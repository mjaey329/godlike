package com.dmj.godlike.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dmj.godlike.serviceImp.WordsBaseServiceImp;

@Controller
@RequestMapping("word")
public class WordsBaseController {

	@Autowired
	private WordsBaseServiceImp wordsBase;

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	public String insert(HttpServletRequest request) {
		return wordsBase.insert(request);
	}
}
