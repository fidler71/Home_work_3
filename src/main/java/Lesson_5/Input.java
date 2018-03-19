package Lesson_5;

import java.util.Scanner;

/**
 * Класс проверки на ошибочность ввода
 */

public class Input {

	static Scanner str = new Scanner(System.in);
	public static double doubleNum() {
		double num=0;

		if (str.hasNextDouble()){
			num=str.nextDouble();
		}
		else {
			System.out.print("Введите число! ");
			str.next();
			num = doubleNum();
		}
		return num;
	}

	public static char operation() {
		char ch = str.next().charAt(0);

		if ((ch!='+')&&((ch!='-'))&&(ch!='*')&&(ch!='/')) {
			System.out.print("Можно только: +,-,*,/  ");
			ch=operation();
		}
		return ch;
	}
}