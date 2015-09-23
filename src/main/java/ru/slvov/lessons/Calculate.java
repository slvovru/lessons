package ru.slvov.lessons;

public class Calculate {

	public static void main(String[] args) {
		System.out.println("Calculating...");
		int first = Integer.valueOf(args[0]);
		int second = Integer.valueOf(args[1]);
		int summa = first + second;
		int difference = first - second;
		int product = first * second;
		double quotient = (second == 0 ? 0 : (double) first / (double) second);
		System.out.println("summa  " + summa);
		System.out.println("difference  " + difference);
		System.out.println("product  " + product);
		System.out.println("quotient  " + quotient);
	}
}