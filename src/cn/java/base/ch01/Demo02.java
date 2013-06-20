package cn.java.base.ch01;

import java.util.Scanner;

public class Demo02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n = 0;
		long sum = 0;
		while((n = input.nextInt()) != 0) {
			for(long i = 1; i <= n; i++) {
				sum += getValueOfNum(i);
			}
			System.out.println("����[" + n + "]�Ĳ��֮���ǣ� " + sum);
			sum = 0;
		}
	}

	private static long getValueOfNum(long num) {
		char[] numOfCharArray = String.valueOf(num).toCharArray();
		long sum = 0;
		for(char c : numOfCharArray) {
			sum += (c - 48);
		}
		return sum;
	}

}
