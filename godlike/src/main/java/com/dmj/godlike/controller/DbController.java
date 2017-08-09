package com.dmj.godlike.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dmj.godlike.beans.Words;
import com.dmj.godlike.serviceImp.WordsBaseServiceImp;
import com.dmj.godlike.util.RequestUtil;
import com.dmj.godlike.util.ResponseUtil;

import net.sf.json.JSONObject;

@RestController
@RequestMapping("mydb")
public class DbController {

	@Autowired
	private WordsBaseServiceImp wordsBase;

	@RequestMapping(value = "selectAll")
	@ResponseBody
	public List<Words> selectAll() {
		return wordsBase.selectAll();
	}

	/**
	 * 
	 * @param request
	 * @return 获得json
	 * @throws IOException
	 */
	@RequestMapping(value = "/post", method = RequestMethod.POST)
	@ResponseBody
	public String post(HttpServletRequest request) throws IOException {

		StringBuffer sb = new StringBuffer();
		InputStream is = request.getInputStream();
		System.out.println("is:" + is);
		InputStreamReader isr = new InputStreamReader(is);
		System.out.println("isr:" + isr);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("br:" + br);
		String s = "";
		while ((s = br.readLine()) != null) {
			sb.append(s);
		}
		String str = sb.toString();
		return str;
	}

	@RequestMapping(value = "/ppost")
	@ResponseBody
	public Words pp(HttpServletRequest request) {
		JSONObject jsonObject = JSONObject.fromObject(RequestUtil.toString(request));
		Words words = (Words) JSONObject.toBean(jsonObject, Words.class);
		System.out.println(words);
		return words;

	}

	@Autowired
	private WordsBaseServiceImp wordsBaseService;

	@RequestMapping(value = "/insert")
	@ResponseBody
	public String insert(HttpServletRequest request) {
		return wordsBaseService.insert(request);
	}

	@RequestMapping(value = "/select")
	@ResponseBody
	public void select(HttpServletResponse response) {

		ResponseUtil.responseOutWithJson(response, wordsBaseService.selectAll());
	}
}
