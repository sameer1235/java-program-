package assignment1;

import java.util.Scanner;

public class P7_armstrong {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
          System.out.println("Enter a 3 digit number to check armstrong : ");

		 int originalNumber, remainder, result = 0;
		 int number = sc.nextInt();

	        originalNumber = number;

	        while (originalNumber != 0)
	        {
	            remainder = originalNumber % 10;
	            result += Math.pow(remainder, 3);
	            originalNumber /= 10;
	        }

	        if(result == number)
	            System.out.println(number + " is an Armstrong number.");
	        else
	            System.out.println(number + " is not an Armstrong number.");
	    
	}

}
