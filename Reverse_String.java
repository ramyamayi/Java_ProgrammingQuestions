package Programming_Questions;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		String word;
Scanner sc = new Scanner(System.in);
System.out.println("Enter string");
word= sc.nextLine();

for(int i=word.length()-1;i>=0;i--) {
	char c= word.charAt(i);
	System.out.print(c);
}
	}

}
