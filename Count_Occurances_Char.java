package Programming_Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Count_Occurances_Char {

	public static void main(String[] args) {
		String word;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		word= sc.nextLine();
		Map<Character,Integer> map = new HashMap<> ();
		int count =0;
		for(int i=0 ;i<word.length();i++) {
			char c = word.charAt(i);
		
		if(map.containsKey(c)) {
			map.put(c, map.get(c)+1);
			count++;		}
		else  {
		map.put(c,1);
		}
	}
		System.out.println(map);
	}
}
