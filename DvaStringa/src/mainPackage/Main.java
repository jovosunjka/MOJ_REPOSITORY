package mainPackage;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		//Second commit
		
		String a = "aab";
		String b = "ccd";

		boolean iskaz = areStringsIsomorpfic(a, b);
		System.out.println(iskaz);
	}

	public static boolean areStringsIsomorpfic(String a, String b) {
		if (a.length() != b.length()) return false;
		
		Map<Character, Character> mapa = new HashMap<Character, Character>();
		
		for (int i = 0; i < a.length(); i++) {
			if (mapa.containsKey(a.charAt(i))) {
				if (mapa.get(a.charAt(i)) != b.charAt(i)) return false;
				
			}
			else mapa.put(a.charAt(i), b.charAt(i));
		}
		
		return true;
	}
	
	

}
