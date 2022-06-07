package Programming_Questions;

public class Combinations_String {

	public static void main(String[] args) {
		char input[] = "1214".toCharArray();
		char[] output = new char[100];

		printCombinations(input, 0, output, 0);
	}

	static void printCombinations(char[] input, int index, char[] output, int outLength) {
		if (input.length == index) {
			System.out.println(String.valueOf(output));
			return;
		}

		output[outLength] = input[index];

		output[outLength + 1] = ' ';

		printCombinations(input, index + 1, output, outLength + 2);

		if (input.length != index + 1)
			printCombinations(input, index + 1, output, outLength + 1);
	}

}
