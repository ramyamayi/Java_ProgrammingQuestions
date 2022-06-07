package Programming_Questions;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueChar_String {

	public static void main(String[] args) {
		String word;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		word= sc.nextLine();
		  boolean result = false;
	        HashSet<Character> set = new HashSet<>();
	        for (int i =0 ;i < word.length();i++){
	            result = set.add(word.charAt(i));
	            if(result==false)
	                break;
	        }
	        System.out.println(set.toString());

	}}
	
