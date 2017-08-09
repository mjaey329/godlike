package com.dmj.godlike.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;

/**
 * 
 * @author Administrator request请求
 */
public class RequestUtil {

	public static String toString(HttpServletRequest request) {
		StringBuffer StringBuffer = new StringBuffer();
		InputStream InputStream = null;
		try {
			InputStream = request.getInputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		InputStreamReader InputStreamReader = new InputStreamReader(InputStream);
		BufferedReader BufferedReader = new BufferedReader(InputStreamReader);
		String string = "";
		try {
			while ((string = BufferedReader.readLine()) != null) {
				StringBuffer.append(string);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return StringBuffer.toString();

	}
}
