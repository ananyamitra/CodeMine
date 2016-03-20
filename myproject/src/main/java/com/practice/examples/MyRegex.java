package com.practice.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex {
	/*public static String pattern=
		"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";*/
	
	public static String pattern=
			"^(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\." +
			"(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\." +
			"(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\." +
			"(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$";
	
	public String ipAddress;
	
	public MyRegex(String ip) {
		ipAddress = ip;
	}
	
	public boolean isMatches(){
		Pattern ipPattern = Pattern.compile(pattern);
		Matcher matcher = ipPattern.matcher(ipAddress);
		return matcher.matches();
		
	}

}

