package com.services;

public class CompressService {
	
	public static String compress (String str) {
		str = upperCaseString(str);
		char chars[] = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		int contador = 1;
		char current = chars[0];
		for (int i = 1; i < chars.length; i++) {
			if (current == chars[i]) {
				contador++;				
			} else {
				sb.append(contador);
				sb.append(current);
				contador = 1;
				current = chars[i];
			}
		}
		sb.append(contador);
		sb.append(current);
		return sb.toString();
	}
	
	public static String upperCaseString(String str) {
		return str.toUpperCase();
	}
}
