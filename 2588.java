package lec01;

import java.util.Scanner;

public class b2588 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		
		System.out.println(a*(b%10));
		System.out.println(a*(b%100/10));
		System.out.println(a*(b/100));
		System.out.println(a*b);
	}

}

