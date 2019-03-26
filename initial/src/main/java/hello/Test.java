package hello;

public class Test {
	public static void main(String[] args) {
		String stringToCompress = "AAABBAAAAABBBCCCCCCCCAAAAA";
		System.out.println(compress(stringToCompress));
		System.out.println(compress("AAaaCcCC"));
		
	}
	
	public static String compressString(String stringToCompress) {
		StringBuilder sb = new StringBuilder();
        char[] chars = stringToCompress.toCharArray();
        char currentChar = chars[0];
		int contador = 1;
		for (int i = 1; i < chars.length; i++) {
			if (currentChar == chars[i]) {
				contador++;
			} else {
				if (contador > 1) 
					sb.append(contador);
					sb.append(currentChar);
					currentChar = chars[i];
					contador = 1;
				
			}
		}
        if (contador > 1) 
        	sb.append(contador);
		 sb.append(currentChar);
	     return sb.toString();
	}
	
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
