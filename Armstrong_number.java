package Programming_Questions;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		 int number, originalNumber, reminder, result = 0;
		 Scanner sc = new Scanner(System.in);
		System.out.println("Enter an number");
		number =sc.nextInt();

	        originalNumber = number;

	        while (originalNumber != 0)
	        {
	            reminder = originalNumber % 10;
	            result += Math.pow(reminder, 3);
	            originalNumber /= 10;
	        }

	        if(result == number)
	            System.out.println(number + " is an Armstrong number.");
	        else
	            System.out.println(number + " is not an Armstrong number.");
	    }
	}


