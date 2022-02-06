package assignment1;

import java.util.Scanner;

public class P2_addtion_user {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the A value :");
		int a = sc.nextInt();
		System.out.println("Enter the B value:");
		int b = sc.nextInt();
		int c = a + b;
		System.out.println("Addition of A and B is : "+c);
		

	}

}
