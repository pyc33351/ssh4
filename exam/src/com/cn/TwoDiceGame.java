package com.cn;

import java.util.Scanner;

public class TwoDiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		Scanner input = new Scanner(System.in);
		int dollar = 0;
		System.out.println("game start!");
		String option = "yes";
		do {
			dice1.roll();
			dice2.roll();

			int temp = dice1.getDice() + dice2.getDice();

			if (temp == 7) {
				
				dollar = temp + dollar;
				System.out.println("you have win 7 dolloar!");
				dice1.display();
				dice2.display();
				System.out.println("do you want to  roll again?");
				System.out.println("yes:next");
				System.out.println("input other:show dollar");
				option = input.next().toLowerCase();

				if (option.equals("yes"))
					continue;
				else {
					System.out.println("the dollar is:" + dollar);
					break;
				}

			} else if (!option.equals("yes")) {
				System.out.println("the dollar is:" + dollar);
				break;
			}
			
			dice1.display();
			dice2.display();
			
			System.out.println("do you want to  roll again?");
			System.out.println("yes:next");
			System.out.println("input other:show dollar");
			
			option = input.next().toLowerCase();
			
			if (option.equals("yes")) {
				continue;
			} else {
				System.out.println("the dollar is:" + dollar);
				break;
			}

		} while (option.equals("yes"));
		input.close();
	}

}
