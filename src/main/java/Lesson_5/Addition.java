package Lesson_5;

/**
 * Класс "Сложение"
 */

public class Addition extends Operation {
	@Override

	double getResult(double a, double b) {
		return a+b;
	}
}